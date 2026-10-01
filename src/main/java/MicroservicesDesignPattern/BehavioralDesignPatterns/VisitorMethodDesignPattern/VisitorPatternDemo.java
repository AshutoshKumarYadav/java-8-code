package MicroservicesDesignPattern.BehavioralDesignPatterns.VisitorMethodDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create files
		File file1 = new File("document.txt", 50);
		File file2 = new File("image.jpg", 150);
		File file3 = new File("video.mp4", 700);
		
		// Create directories
		Directory root = new Directory("Root"); 
		Directory subDir = new Directory("SubFolder"); 
		
		// Build file system structure
		root.addElement(file1);
		root.addElement(subDir);
		subDir.addElement(file2);
		subDir.addElement(file3);
		
		// 1. Calculate total size
		SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
		root.accept(sizeVisitor);
		System.out.println("Total size: " + sizeVisitor.getTotalSize() + " KB");
		
		// 2. Print file system structure
		StructurePrinterVisitor structureVisitor = new StructurePrinterVisitor();
		root.accept(structureVisitor);
		
	}

}
class File implements FileSystemElement {
	private String name;
	private int size;// In KB
	public File(String name,int size) {
		this.name=name;
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public void accept(FileSystemVisitor visitor) {
		visitor.visit(this);
	}
}
class Directory implements FileSystemElement{
	private String name;
	private List<FileSystemElement> elements = new ArrayList<>();
	
	public Directory(String name) {
		this.name=name;
	}
	public void addElement(FileSystemElement element) {
		elements.add(element);
	}
	public List<FileSystemElement> getElements(){
		return elements;
	}
	public String getName() {
		return name;
	}
	public void accept(FileSystemVisitor visitor) {
		visitor.visit(this);
	}	
	
}
class SizeCalculatorVisitor implements FileSystemVisitor {
	private int totalSize=0;
	
	public void visit(File file) {
		totalSize += file.getSize();
	}
	
	public void visit(Directory directory ) {
		for(FileSystemElement element:directory.getElements()) {
			element.accept(this);
		}
	}
	public int getTotalSize() {
		return totalSize;
	}
}
class StructurePrinterVisitor implements FileSystemVisitor {
	private String indent="";
	public void visit(File file) {
		System.out.println(indent + "File: " + file.getName() + " (" + file.getSize() + " KB)");
	}
	public void visit(Directory directory) {
		 System.out.println(indent + "Directory: " + directory.getName());
		 indent += "  "; // Increase indentation for nested elements
		 for(FileSystemElement elements:directory.getElements()) {
			 elements.accept(this);
		 }
		 indent=indent.substring(2);// Restore indentation
	}
	
}




















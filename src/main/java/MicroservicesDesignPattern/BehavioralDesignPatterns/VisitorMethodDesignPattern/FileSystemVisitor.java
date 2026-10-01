package MicroservicesDesignPattern.BehavioralDesignPatterns.VisitorMethodDesignPattern;

//Step 3: Define the Visitor Interface
public interface FileSystemVisitor {
	void visit(File file);
	void visit(Directory directory);
}

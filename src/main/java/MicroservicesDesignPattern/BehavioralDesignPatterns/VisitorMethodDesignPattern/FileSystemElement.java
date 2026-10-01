package MicroservicesDesignPattern.BehavioralDesignPatterns.VisitorMethodDesignPattern;

public interface FileSystemElement {
	void accept(FileSystemVisitor visitor);
}

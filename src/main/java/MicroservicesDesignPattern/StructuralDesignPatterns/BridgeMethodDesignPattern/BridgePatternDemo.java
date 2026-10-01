package MicroservicesDesignPattern.StructuralDesignPatterns.BridgeMethodDesignPattern;

public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(new RedColor());
		Shape blueSquare = new Square(new BlueColor());
		redCircle.draw();
		blueSquare.draw();
	}

}
//Step 2: Implement Concrete Implementors (RedColor, BlueColor)
// Concrete Implementor 1
class RedColor implements Color{
	public void fillcolor() {
		System.out.println("Filling with the red color.");
	}
}

// Concrete Implementor 1
class BlueColor implements Color{
	public void fillcolor() {
		System.out.println("Filling with Blue color");
	}
}
//Step 3: Define the Abstraction (Shape)
abstract class Shape{
	protected Color color;//COmposition HAS-A relation.
	public Shape(Color color) {
		this.color=color;
	}
	abstract void draw();
}
//Step 4: Implement Concrete Abstractions (Circle, Square)
//Refined Abstraction 1
class Circle extends Shape{
	public Circle(Color color) {
		super(color);
	}
	
	void draw() {
		System.out.println("Drawing Circle - ");
		color.fillcolor();
	}
}

// Refined Abstraction 2

class Square extends Shape{
	public Square(Color color) {
		super(color);
	}
	
	void draw() {
		System.out.println("Drawing Sqaure - ");
		color.fillcolor();
	}
}





















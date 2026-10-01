package OOPSConcept;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test Abstraction
		Vechile vech = new Car();
		vech.start();
		vech.stop();
	}
	

}
//Abstraction hides the internal details and only shows the necessary functionalities.
abstract class Vechile{
	abstract void start();// Abstract method (no body)
	void stop() {
		System.out.println("Vechile is stopping !!");
	}
}
class Car extends Vechile{
	public void start() {
		System.out.println("Car is starting!!");
	}
	
}
package OOPSConcept;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pr = new Child();
		pr.showMessage();
	}

}
//Method Overriding (Runtime Polymorphism)
class Parent{
	void showMessage() {
		System.out.println("Message from Parent");
	}
}
class Child extends Parent{
	void showMessage() {
		System.out.println("Message from Child");
	}
}

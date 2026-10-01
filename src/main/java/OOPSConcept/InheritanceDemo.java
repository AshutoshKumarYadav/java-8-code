package OOPSConcept;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test Inheritance
		Dog dog = new Dog();
		dog.makeSound();
		dog.bark();
	}

}
class Animal{
	void makeSound() {
		System.out.println("Animal makes a sound.");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks...");
	}
}
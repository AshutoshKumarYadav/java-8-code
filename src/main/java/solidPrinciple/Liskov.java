package solidPrinciple;

public class Liskov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sparrow sp = new Sparrow();
		sp.fly();
		sp.eat();
		Penguin pn = new Penguin();
		pn.fly();
	}

}
class Bird {
	public void eat() {
		System.out.println("*** This bird is eating!");
	}
}

class Sparrow extends Bird implements Flyable{
	public void fly() {
		System.out.println("Sparrow is Flaying");
	}
	
}
class Penguin extends Bird{
	public void fly() {
		throw new UnsupportedOperationException("Penguin can't fly");
	}
}
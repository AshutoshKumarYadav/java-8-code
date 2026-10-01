package solidPrinciple;

public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workable dv = new Developer();
		dv.work();
		Chef ch = new Chef();
		ch.eat();
		ch.work();
	}

}
class Developer implements Workable{
	public void work() {
		System.out.println("Developers are working");
	}
}
class Chef implements Workable, Eatable{
	public void work() {
		System.out.println("Chef is working");
	}
	public void eat() {
		System.out.println("Chef is eating");
	}
}
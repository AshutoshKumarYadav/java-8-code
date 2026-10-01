package PracticeJava;

public class InterfaceImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp exp = new Exp();
		exp.f1();
		exp.f3();
		exp.f4();
		//Exp exp = new Exp();
		//exp.f2();
		//Interface abc1 = new Exp();
		//abc1.f2(); We can't access the static method present in Interface by crating the child of implemented class (Exp) or
		//by creating the object of Exp and storing in parent class. We directly call static method by putting the interface name like below.
		
		
		Interface abc = new Exp();
		Interface.f2();
	}

}
class Exp implements Interface{
	public void f1() {
		System.out.println("Hello World f1");
	}
	/*
	 * public void f2() { System.out.println("Hello World f2"); }
	 */
	public void f3() {
		System.out.println("Hello World f3");
	}
	public void f4() {
		System.out.println("Hello World f4");
	}
}
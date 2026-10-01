package PracticeJava;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Example1 newExp = new Example1();
		  newExp.f1();
		  AbstractExp newExp1 = new Example1(); 
		  newExp1.f1();
		  newExp1.f2();
		// AbstractExp newExp2 = new AbstractExp(); abstract class object can't
		// instansiated.
		// newExp2.f1();
		// Example1 newExc = new Example1(); // abstract class can't be instensiated
	}

}

abstract class AbstractExp {
	int x=5;
	abstract void f1();
	abstract void f2();
	public AbstractExp() {
		System.out.println("Hello");
		
	}
}
/*
 * abstract class Example1 extends AbstractExp{
 * 
 * public void f1() { System.out.println("Ashutosh Kumar"); }
 * 
 * public void f2() { System.out.println("Hellooo1"); }
 * 
 * }
 */
class Example1 extends AbstractExp{
	
	  public void f1() { System.out.println("Ashutosh Kumar"); 
	 }
	 public void f2() {
		 System.out.println("Hellow world");
	 }
	
	
}
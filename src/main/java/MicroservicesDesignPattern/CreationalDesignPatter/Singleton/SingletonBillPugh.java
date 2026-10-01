package MicroservicesDesignPattern.CreationalDesignPatter.Singleton;

//It guarantees that a class has just one instance and offers a way to access it globally.

public class SingletonBillPugh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonBillPughOne single = SingletonBillPughOne.getInstance();
		SingletonBillPughOne single1 = SingletonBillPughOne.getInstance();
		//single.showmessage();
		//System.out.println("*********** SingletonBillPughOne : "+single == single1);
		System.out.println(single == single1);// true than it is created one instance
	}

}
class SingletonBillPughOne {
	//restrict instantiation of the SingletonBillPughOne class from outside the class.
	private SingletonBillPughOne() {}
	
	//inner static helper class,It ensures lazy initialization, thread safety, and efficient performance.
	private static class SingletonHelper{
		private static final SingletonBillPughOne INSTANCE = new SingletonBillPughOne();
	}
	// global access point for the SingletonBillPughOne instance.
	public static SingletonBillPughOne getInstance() {
		return SingletonHelper.INSTANCE;
	}
	//simple instance method inside the SingletonBillPughOne class
	public void showmessage() {
		System.out.println("Bill Pugh Singleton (Best Practice)");
	}
}
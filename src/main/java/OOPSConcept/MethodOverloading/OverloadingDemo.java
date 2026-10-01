package OOPSConcept.MethodOverloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method Overloading (Compile-time Polymorphism)
		MathOperation math = new MathOperation();
		System.out.println("Inside add int method : " + math.add(2, 4));
		
		System.out.println("Inside add double method : " +math.add(2.5, 3.2));
	}

}
class MathOperation{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
}
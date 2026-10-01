package PracticeJava;
@FunctionalInterface
public interface FunctionalInterfaceOne extends FunctionalInterfaceer{
	
	
	   //void f6(); // Second abstract method
	     default void f7() {
	        System.out.println("********** f7 ** Hello : ");
	    }

	    default void f8() {
	        System.out.println("********** f8 ** Hello : ");
	    }

	    static void f11() {
	        System.out.println("****** Hello ****** f11 ");
	    }

	    static void f12() {
	        System.out.println("****** Hello ****** f12 ");
	    }
	
}

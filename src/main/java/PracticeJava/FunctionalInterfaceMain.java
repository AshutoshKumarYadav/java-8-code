package PracticeJava;
@FunctionalInterface
public interface FunctionalInterfaceMain extends FunctionalInterfaceer,FunctionalInterfaceOne{
	//void f11(); // Second abstract method
     default void f7() {
        System.out.println("********** functionalInterfaceMain f7 ** Hello : ");
    }

    default void f8() {
        System.out.println("********** functionalInterfaceMain f8 ** Hello : ");
    }

    static void f9() {
        System.out.println("******  functionalInterfaceMain Hello ****** f9 ");
    }

    static void f10() {
        System.out.println("****** functionalInterfaceMain Hello ****** f10 ");
    }
}

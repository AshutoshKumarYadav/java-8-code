package PracticeJava;

@FunctionalInterface
public interface FunctionalInterfaceer {
    void f1(); // Only one abstract method allowed

     default void f2() {
        System.out.println("********** f2 ** Hello : ");
    }

     default void f4() {
        System.out.println("********** f4 ** Hello : ");
    }

     static void f3() {
        System.out.println("****** Hello ****** f3 ");
    }

     static void f5() {
        System.out.println("****** Hello ****** f5 ");
    }
}


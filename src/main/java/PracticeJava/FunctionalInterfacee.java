package PracticeJava;

public class FunctionalInterfacee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceMain exp = new Exmpl();
		exp.f1();
		exp.f2();
		exp.f4();
		exp.f7();
		exp.f8();
		FunctionalInterfaceMain.f9();
		FunctionalInterfaceMain.f10();
		FunctionalInterfaceer.f3();
		FunctionalInterfaceer.f5();
		FunctionalInterfaceOne.f11();
		FunctionalInterfaceOne.f12();
	}

}
class Exmpl implements FunctionalInterfaceMain{
	public void f1() {
		System.out.println(" Present in Exmpl");
	}
}
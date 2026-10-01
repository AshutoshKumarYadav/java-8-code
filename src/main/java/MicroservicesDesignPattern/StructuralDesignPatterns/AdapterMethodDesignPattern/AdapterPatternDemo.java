package MicroservicesDesignPattern.StructuralDesignPatterns.AdapterMethodDesignPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 4: Use the Adapter in the Client Code
		// Create an incompatible MobileCharger
		MobileCharger mobilechargers = new MobileCharger();
		//mobilechargers.chargePhone();
		// Use Adapter to make it compatible with a Laptop
		TypeCCharger typeCharger = new ChargerAdapter(mobilechargers);
		 // Charge the laptop using the adapter
		typeCharger.chargeLaptop();
	}

}
//Step 2: Create the Adaptee Class (Incompatible Class)
class MobileCharger{
	public void chargePhone() {
		System.out.println("Charging phone with USB charger!!");
	}
}
//Step 3: Create the Adapter Class
//Adapter Class (Bridges MobileCharger and TypeCCharger)
class ChargerAdapter implements TypeCCharger{
	private MobileCharger mobilecharger;
	
	public ChargerAdapter(MobileCharger mobilecharger) {
		this.mobilecharger=mobilecharger;
	}
	public void chargeLaptop() {
		System.out.println("Adapter converting USB to type-C");
		mobilecharger.chargePhone();
	}
}

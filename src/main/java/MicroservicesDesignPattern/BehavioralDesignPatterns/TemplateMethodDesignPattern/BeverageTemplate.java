package MicroservicesDesignPattern.BehavioralDesignPatterns.TemplateMethodDesignPattern;

//Step 1: Create the Abstract Class with the Template Method
public abstract class BeverageTemplate {
	
	// Template method (final to prevent overriding)
	public final void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {	// Hook method
			addCondiments();
		}
	}
	// Common steps
	private void boilWater() {
		System.out.println("Boiling water...");
	}
	private void pourInCup() {
		System.out.println("Pouring into cup...");
	}
	// Steps that subclasses must implement
	protected abstract void brew();
	protected abstract void addCondiments();
	
	// Hook method (subclasses can override if needed)
	protected boolean customerWantsCondiments() {
		return true;// Default implementation
	}
		
	
}

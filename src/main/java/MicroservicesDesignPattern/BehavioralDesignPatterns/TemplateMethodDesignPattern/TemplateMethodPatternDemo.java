package MicroservicesDesignPattern.BehavioralDesignPatterns.TemplateMethodDesignPattern;

public class TemplateMethodPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Making Tea:");
		BeverageTemplate tea = new Tea();
		tea.prepareBeverage();
		System.out.println("\nMaking Coffee:");
		BeverageTemplate coffee = new Coffee();
		coffee.prepareBeverage();
	}

}
//Step 2: Create Concrete Implementations (Tea & Coffee)
class Tea extends BeverageTemplate{
	protected void brew() {
		System.out.println("Steeping the tea bag...");
	}
	protected void addCondiments() {
		System.out.println("Adding lemon...");
	}
}

class Coffee extends BeverageTemplate {
	protected void brew() {
		System.out.println("Dripping coffee through filter...");
	}
	protected void addCondiments() {
		 System.out.println("Adding sugar and milk...");
	}
}
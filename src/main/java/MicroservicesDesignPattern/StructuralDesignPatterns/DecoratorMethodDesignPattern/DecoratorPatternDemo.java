package MicroservicesDesignPattern.StructuralDesignPatterns.DecoratorMethodDesignPattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start with a plain coffee
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription()+" | Cost : $"+coffee.getCost());
		
		//Add Milk
		coffee = new Milk(coffee);
		System.out.println(coffee.getDescription()+" | Cost : $"+coffee.getCost());
		
		//Add sugar
		coffee = new Sugar(coffee);
		System.out.println(coffee.getDescription()+" | Cost :$"+coffee.getCost());
		
		//Add Whipped Cream
		coffee = new WhippedCream(coffee);
		System.out.println(coffee.getDescription()+" | Cost : $"+ coffee.getCost());
	}

}
//Step 2: Create the Concrete Component (SimpleCoffee)
//Concrete Component (Basic Coffee)
class SimpleCoffee implements Coffee{
	public String getDescription() {
		return "Plain Coffee";
	}
	public double getCost() {
		return 5.0;
	}
}

//Step 3: Create the Abstract Decorator (CoffeeDecorator)
//Abstract Decorator (Wraps Coffee)
abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee=coffee;
	}
	
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}
	public double getCost() {
		return decoratedCoffee.getCost();
	}
	
	
}
//Step 4: Create Concrete Decorators (Milk, Sugar)
class Milk extends CoffeeDecorator{
	public Milk(Coffee coffee) {
		super(coffee);
	}
	public String getDescription() {
		return decoratedCoffee.getDescription()+",Milk";
	}
	public double getCost() {
		return decoratedCoffee.getCost()+1.5;
	}
}
//Concrete Decorator 2 - Adds Sugar
class Sugar extends CoffeeDecorator{
	public Sugar(Coffee coffee) {
		super(coffee);
	}
	public String getDecription() {
		return decoratedCoffee.getDescription()+",Sugar";
	}
	public double getCost() {
		return decoratedCoffee.getCost()+0.5;
	}
}
//Concrete Decorator 3 - Adds Whipped Cream
class WhippedCream extends CoffeeDecorator{
	public WhippedCream(Coffee coffee) {
		super(coffee);
	}
	public String getDecription() {
		return decoratedCoffee.getDescription()+",WhippedCream";
	}
	public double getCost() {
		return decoratedCoffee.getCost()+2.0;
	}
}













































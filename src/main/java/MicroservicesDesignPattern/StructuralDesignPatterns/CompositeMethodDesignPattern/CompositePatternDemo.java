package MicroservicesDesignPattern.StructuralDesignPatterns.CompositeMethodDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 4: Use the Composite Pattern in Client Code
		// Creating Leaf Employees
		Employee dev1 = new Developer("John Doe", "Backend Developer");
		Employee dev2 = new Developer("Alice Smith", "Frontend Developer");
		Employee designer = new Designer("Bob Johnson", "UX Designer");
		// Creating Manager and adding employees
		Manager mg = new Manager("Michael Scott", "Engineering Manager");
		mg.addEmployee(dev1);
		mg.addEmployee(dev2);
		mg.addEmployee(designer);
		
		// Creating CEO and adding the Engineering Manager under him
		Manager ceo=new Manager("Elon Musk", "CEO");
		ceo.addEmployee(mg);
		
		// Display the hierarchy
		ceo.showDetails();
	}

}
//Step 2: Create Leaf Class (Developer, Designer)
//Leaf Class 1 (Individual Employee)

class Developer implements Employee{
	
	private String name;
	private String position;
	
	public Developer(String name,String position) {
		this.name=name;
		this.position=position;
		
	}
	
	public void showDetails() {
		System.out.println(name+"-"+position);
	}
}
//Leaf Class 2 (Another Individual Employee)

class Designer implements Employee{
	private String name;
	private String position;
	
	public Designer(String name,String position) {
		this.name=name;
		this.position=position;
	}
	public void showDetails() {
		System.out.println(name+"-"+position);
	}
}
//Step 3: Create Composite Class (Manager)
//Composite Class (Can have multiple employees under it)

class Manager implements Employee{
	private String name;
	private String position;
	private List<Employee> subordinates=new ArrayList<Employee>();
	
	public Manager(String name, String position) {
		this.name=name;
		this.position=position;
	}
	public void addEmployee(Employee employee) {
		subordinates.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		subordinates.remove(employee);
	}
	public void showDetails() {
		System.out.println(name+"-"+position);
		for(Employee em:subordinates) {
			System.out.println(" "); // Indentation for hierarchy
			em.showDetails();
		}
	}
	
	
	
	
}

















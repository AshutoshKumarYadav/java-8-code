package MicroservicesDesignPattern.CreationalDesignPatter.Prototype;
//Prototype allows us to hide the complexity of making new instances from the client.
//The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations.
public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an original object
		Employee em = new Employee("Alice","IT");
		em.showInfo();
		// Clone the object
		Employee emcloned = em.clone();
		emcloned.clone();
		
		// Check if both objects are different instances
		System.out.println(em==emcloned);// Output: false (Different objects)
	}

}

class Employee implements Prototype{
	private String name;
	private String department;
	
	public Employee(String name,String department) {
		this.name=name;
		this.department=department;
	}
	// Implementing the clone method
	 @Override
	public Employee clone() {
		return new Employee(this.name,this.department);// Creates a new Employee object with the same values
	}
	public void showInfo() {
		System.out.println("Employee "+name+"Department : "+department);
	}
}
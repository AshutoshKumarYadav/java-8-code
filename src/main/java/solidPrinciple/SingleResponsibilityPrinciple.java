package solidPrinciple;

public class SingleResponsibilityPrinciple {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Ashutosh",5000.00);
		SalaryCalculator salarycal = new SalaryCalculator();
		System.out.println("Bonus For : "+emp.getName()+"Bonus Salray :"+salarycal.calculateBonus(emp));
	}

}
//S - Single Responsibility Principle (SRP)
	class Employee{
		private String name;
		private double salary;
		
		public Employee(String name,double salary) {
			this.name=name;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
	}
	
	// A separate class for salary calculations (SRP)
	class SalaryCalculator {
		public double calculateBonus(Employee emp) {
			return emp.getSalary()*0.1;
		}
	}

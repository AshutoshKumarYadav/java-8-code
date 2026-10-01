package PracticeJava;

public class Employee2 {
	public Employee2(double salary, String name, double empId) {
		super();
		this.salary = salary;
		this.name = name;
		this.empId = empId;
	}


	private double salary;
	private String name;
	private double empId;

	

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee2 [salary=" + salary + ", name=" + name + ", empId=" + empId + "]";
	}

}

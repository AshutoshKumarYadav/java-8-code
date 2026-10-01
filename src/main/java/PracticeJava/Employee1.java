package PracticeJava;

public class Employee1 {
	public Employee1(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	private final String name;
	private final String department;
	private final int salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}

package PracticeJava;

public class Employeee {

	
	private final int id;
    private final String name;
    private final int salary;
	
	public Employeee(int id, String name, int salary) {
		this.salary = salary;
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

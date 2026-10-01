package PracticeJava;
import java.time.LocalDate;
import java.util.Date;

public class Emplyoees {

	public Emplyoees(String name, int age, String department, String gender, double salary, int dateOfjoining,
			int lastDateInCompany) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
		this.dateOfjoining = dateOfjoining;
		this.lastDateInCompany = lastDateInCompany;
	}
	private final String name;
	private final int age;
	private final String department;
	private final String gender;
	private final double salary;
	private final int  dateOfjoining;
	private final int  lastDateInCompany;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	public String getGender() {
		return gender;
	}
	public double getSalary() {
		return salary;
	}
	public int getDateOfjoining() {
		return dateOfjoining;
	}
	public int getLastDateInCompany() {
		return lastDateInCompany;
	}
	@Override
	public String toString() {
		return "Emplyoees [name=" + name + ", age=" + age + ", department=" + department + ", gender=" + gender
				+ ", salary=" + salary + ", dateOfjoining=" + dateOfjoining + ", lastDateInCompany=" + lastDateInCompany
				+ "]";
	}
	
}

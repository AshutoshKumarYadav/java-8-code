package PracticeJava;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Etcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(0, 1, 0, 3, 12,4,0,5,10);
		Stream<Integer> filter = numbers.stream().filter(x->x==0);
		Stream<Integer> filter2 = numbers.stream().filter(x->x!=0);
		List<Integer> array = Stream.concat(filter2, filter).toList();
		System.out.println(array);
		
		//Print the current date and time in format 12/30/2022 12:30:42
		LocalDate useDate = LocalDate.now();
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String format = useDate.format(formatter);
		System.out.println(format);
		
		
		List<Employee> employees = Arrays.asList(

	               new Employee(1, "Sreeram", 100000, "IT"),

	               new Employee(2, "Venkat", 20000, "Sales"),

	               new Employee(3, "Mohan", 500000, "IT"),

	               new Employee(4, "Ramesh", 450000, "Marketing"),

	               new Employee(5, "Avinash", 30000, "Sales"));

	       System.out.println("\nEmployees by department:");
	       
	     //TODO -Group Employees by department and print them using java8 streams
	       Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
	       System.out.println(collect);


	       //TODO - sort employees list by their name in descending order and print their names
	       List<Employee> collect2 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
	       System.out.println(collect2);
		
	}
	 public static class Employee {

	       private int id;

	       private String name;

	       private double sal;

	       private String department;

	       public int getId() {

	           return id;

	       }

	       public void setId(int id) {

	this.id = id;

	       }

	       public String getName() {

	           return name;

	       }

	       public void setName(String name) {

	           this.name = name;

	       }

	       public double getSal() {

	           return sal;

	       }

	       public void setSal(double sal) {

	           this.sal = sal;

	       }

	       public String getDepartment() {

	           return department;

	       }

	       public void setDepartment(String department) {

	           this.department = department;

	       }

	       public Employee(int id, String name, double sal, String department) {

	this.id = id;

	           this.name = name;

	           this.sal = sal;

	           this.department = department;

	       }

	       @Override

	       public String toString() {

	           return "Employee{" +

	                   "id=" + id +

	                   ", name='" + name + '\'' +

	                   ", sal=" + sal +

	                   ", department='" + department + '\'' +

	                   '}';

	       }

	   }


}

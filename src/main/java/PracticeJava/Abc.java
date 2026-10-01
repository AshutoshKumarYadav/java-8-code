package PracticeJava;
import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//String s = "find the first maximum length even word from String";
		//String num = Arrays.stream(s.split(" ")).filter(x->x.length()%2==0).max(Comparator.comparingInt(String::length)).orElse("Not Found");
		//System.out.println(num);
		
		
		String s = "find the first maximum length even word from String";
		
		

		String num = Arrays.stream(s.split(" ")) // Split the input into words
		        .filter(x -> x.length() % 2 == 0) // Keep only even-length words
		        .max(Comparator.comparingInt(String::length)) // Find the maximum length word
		        .orElse("Not Found"); // Provide a default if no match is found

		System.out.println(num); // Print the result
		
		//The output should be sorted first by age in descending order
		 
		//name in alphabetical order.

		 
		//names only print with First 2 charecters in Capital Letters
		 
		
		List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, "HR"),
                new Employee("Bob", 45, "IT"),
                new Employee("Charlie", 30, "HR"),
                new Employee("Hannah", 50, "IT"),
                new Employee("Ram", 50, "IT"),
                new Employee("Elle", 60, "HR"),
                new Employee("Suresh", 60, "HR"),
                new Employee("Eve", 50, "Finance"),
                new Employee("Ganesh", 40, "Finance"));
		
		//print age in reverse  order
		List<Employee> ageNum = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		System.out.println("Sorting Employees on the basis of age : "+ageNum);
		
		//Sort the Employees on the basis of age in reverse order and get the name and change first two character to uppercase and
		//print name,age and department
				
				
		List<Employee> employDetail = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getName))
				.map(x->new Employee(x.getName().substring(0,2).toUpperCase()+x.getName().substring(2),x.getAge(),x.getDepartment())).collect(Collectors.toList());
		
		System.out.println("Employee Details : "+employDetail);
		
		
		//List<Employee> ageNum = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		//List<Employee> ageNum = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getName))
				//.map(e->new Employee(
				//		e.getName().substring(0,2).toUpperCase()+e.getName().substring(2),e.getAge(),e.getDepartment())).collect(Collectors.toList());
		//System.out.print(ageNum);
		//{1, 2, 3, 4, 5, 6, 7, 8}
		//List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		//Map<Integer,Integer>  mapNum =number.stream().collect(Collectors.toMap(x->x, x->x*x*x));
		//System.out.print(mapNum);
	}

}

package PracticeJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee2 emp = new Employee2(0, null, 0);
		List<Employee2> ls = Arrays.asList(
	            new Employee2(50000, "IT", 1),
	            new Employee2(60000, "HR", 2),
	            new Employee2(50000, "Finance", 3),
	            new Employee2(70000, "IT", 4),
	            new Employee2(60000, "Finance", 5)
	        );
		Map<Double, List<Object>> modified = ls.stream()
			    .collect(Collectors.groupingBy(
			        Employee2::getSalary,
			        Collectors.mapping(emp -> new Employee2(
			            emp.getSalary() * 0.10,  // 10% of salary
			            emp.getName(),
			            emp.getEmpId()
			        ), Collectors.toList())
			    ));
		//System.out.println(modified);
		
		List<Employee2> collect = ls.stream().collect(Collectors.mapping(emp->new Employee2(
				emp.getSalary()*0.10,emp.getName(),emp.getEmpId()), Collectors.toList()));
		//System.out.println(collect);
		
		String collect2 = ls.stream().collect(Collectors.teeing(Collectors.summarizingDouble(Employee2::getSalary), Collectors.averagingDouble(Employee2::getSalary), (total,avg)->"Total :" +total + "Avg : "+avg));
		System.out.println(collect2);
		
		List<String> names = List.of("Alisg","Bob","Charlie");
		
		List<String> collect3 = names.stream().peek(x->System.out.println("Original :"+x)).map(String::toUpperCase).peek(x->System.out.println("Uppercase : " +x)).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

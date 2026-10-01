package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AllInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find maximum length
		String s = "find the first maximum length even word from String";
		String orElse = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).orElse("Not Found");
		//System.out.println(orElse);
		//System.out.println();
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
		
		List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
		//System.out.println(collect);
		List<Employee> collect2 = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getName))
		.map(x-> new Employee(x.getName().substring(0,2).toUpperCase()+x.getName().substring(2),x.getAge(),x.getDepartment())).collect(Collectors.toList());
		//System.out.println(collect2);
		
		//{1, 2, 3, 4, 5, 6, 7, 8} double the digit
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Map<Integer, Integer> collect3 = number.stream().collect(Collectors.toMap(x->x, x->x*x*x));
		//System.out.println(collect3);
		
		List<Emplyoees> listOfEmployeess = new ArrayList<>();
		listOfEmployeess.add(new Emplyoees("Alice",30,"HR","female",10.00,2015,2016));
		listOfEmployeess.add(new Emplyoees("Ram",15,"IT","Male",20.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ram",15,"IT","Male",20.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ram",16,"IT","Male",30.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ashutosh",12,"HR","female",10.00,2009,2021));
		listOfEmployeess.add(new Emplyoees("Ban",18,"Sales","Male",30.00,2010,2016));
		listOfEmployeess.add(new Emplyoees("Catt",20,"Marketing","Male",60.00,2011,2016));
		listOfEmployeess.add(new Emplyoees("Dog",9,"HR","Male",20.00,2015,2023));
		listOfEmployeess.add(new Emplyoees("Asdf",45,"Sales","female",30.00,2012,2019));
		listOfEmployeess.add(new Emplyoees("Nice",23,"Marketing","Male",30.00,2014,2024));
		listOfEmployeess.add(new Emplyoees("Durga",46,"IT","female",100.00,2013,2025));
		listOfEmployeess.add(new Emplyoees("Rohith",25,"Marketing","female",80.00,2015,2023));
		
		
		//Filter employees with salary greater than a certain amount 
		List<Emplyoees> collect4 = listOfEmployeess.stream().filter(x->x.getSalary()>50).collect(Collectors.toList());
		//System.out.println(collect4);		
				
				
				//skip top 3 on the basis of salary  and print rest
		List<Emplyoees> collect5 = listOfEmployeess.stream().filter(x->x.getSalary()>5).skip(3).collect(Collectors.toList());
				
				//System.out.println("************* emplSkip : "+collect5);
				
				//Fetched top 3 salary
				List<Emplyoees> collect6 = listOfEmployeess.stream().sorted(Comparator.comparing(Emplyoees::getSalary).reversed()).limit(3).collect(Collectors.toList());
				//System.out.println("******************** topThreeFetched : "+collect6);
				
				//Given an employee list , sort employee based on there salary in descending order.
				List<Emplyoees> collect7 = listOfEmployeess.stream().sorted(Comparator.comparing(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
				
				
				//System.out.println("************ sortEmplDesc : "+collect7);
				
				
				
				//How many male or female employee are there in company
				Map<String, Long> collect8 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
				
				//System.out.println("********* maleFemaleCount : "+ collect8);
				
				
				//Print the name of all department in the organization
				Map<String, List<Emplyoees>> collect9 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
				
				//System.out.println("********** listOfDepart : "+collect9);
				
				//System.out.println("********** allDept : "+allDept);
				
				//Average age of male and female employee
				Map<String, Double> averageMaleFemale = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getAge)));
				
				
				//System.out.println("************** averageMaleFemale : "+ averageMaleFemale);
				
				//get the detail of highest paid salary in the organization (if we want single output)
				List<Emplyoees> highestSalary = listOfEmployeess.stream().sorted(Comparator.comparing(Emplyoees::getSalary).reversed()).limit(1).collect(Collectors.toList());
				
				//System.out.println("**************** highestSalary : "+ highestSalary);
				Optional<Emplyoees> collect10 = listOfEmployeess.stream().collect(Collectors.maxBy(Comparator.comparing(Emplyoees::getSalary)));
				
				//System.out.println("*********** highestSalry1 : "+collect10);
				
				
				//System.out.println("*********** highestSalry3 : "+highestSalry3);
				
				
				//System.out.println("*************** highestSalry2 : "+highestSalry2);
				
				//get the name of employee who have joined after 2015
				Map<String, List<Emplyoees>> joinedAfter = listOfEmployeess.stream().filter(x->x.getDateOfjoining()>2015).collect(Collectors.groupingBy(Emplyoees::getName));
				
				
				//System.out.println("*************** joinedAfter : "+joinedAfter);
				//Count the number of employee in each department
				Map<String, Long> countEmpl = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.counting()));
				//System.out.println("************** countEmpl: "+countEmpl);
				
				//What is the avarage salary of each department
				Map<String, Double> averageSalary = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.averagingDouble(Emplyoees::getSalary)));
				
				//System.out.println("************** averageSalary : "+averageSalary);
				
				//get the details of youngest male emloyee in product department (IT)
				Map<Integer, List<Emplyoees>> getYoungestEmpl = listOfEmployeess.stream().filter(x->x.getGender()=="Male" || x.getDepartment()=="IT").collect(Collectors.groupingBy(Emplyoees::getAge));
				
				//System.out.println("****************** getYoungestEmpl : "+getYoungestEmpl);
				
				
				
				//System.out.println("****************** getYoungestEmpl : "+getYoungestEmpl1);
				
				
				//System.out.println("****************** getYoungestEmpl : "+getYoungestEmpl2);
				


					//System.out.println("****************** Youngest Male IT Employees: " + youngestMaleITEmployees);

				//Who has the most working experience in the organization
				//listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::get))
					
					//System.out.println("********** mostWorkingExp : "+mostWorkingExp);
				
				//how many male and female employee are there in sales and marketing departement
					
					
					//System.out.println("************ maleFemaleSalesMar : "+maleFemaleSalesMar);
				
				// what is the average salary of male and female employee
					
					//System.out.println("*************** listMaleFemale : "+listMaleFemale);
				
				//List down name of all employee in each department
					
					
						//System.out.println("Employees In "+en.getKey());
						
						//System.out.println("****** empListValue :"+empListValue.stream().map(Emplyoees::getName).collect(Collectors.toList()));
					
					
					//listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment)).forEach((x,y)->System.out.println("Employees in "+x+":" + y.stream().map(Emplyoees::getName).collect(Collectors.toList())));
					
				
				//list down average salary and total salary of the whole organization
					
					//System.out.println("************* listAverage : "+listAverage.getAverage() + "*************** total sum "+listAverage.getSum());
				
				
				//Separate the employees who are younger or equal to 25 years from those employee who are older than 25 years.
					
					
						//System.out.println("Younger than  "+en.getKey());
						
						//System.out.println("Older than  "+listEmp.stream().collect(Collectors.toList()));
					
				
				//Who is the oldest employee in the organization and what is his age and from which departement?
					
			
		
		
		//*************************
				
				
		
				//sort in ascending, and double digit shoul be the sum of it.
				List<Integer> ls = Arrays.asList(5,4,7,56,23);
				List<Integer> collect11 = ls.stream().map(AllInOne::twoSum).sorted().collect(Collectors.toList());
				System.out.println(collect11);
				
				
				// FirstNonRepeating
				String input = "swiss";
				Character orElse2 = input.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1)
				.map(Map.Entry::getKey).findFirst().orElse(null);
				System.out.println(orElse2);
		
				//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static int twoSum(int value) {
		int sum = 0;
		while(value !=0) {
			sum+=value%10;
			value/=10;
			
		}
		return sum;
	}

}

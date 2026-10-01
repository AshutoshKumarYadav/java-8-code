package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get distinct char from String
		String s = "My name is Ashutosh kumar";
		String distinctChars = s.chars().mapToObj(c->String.valueOf((char)c).toLowerCase()).distinct().collect(Collectors.joining(", "));
		//System.out.println(distinctChars);
		
		//String s = "find the first maximum length even word from String";
		String str = "find the first maximum length even word from String";
		String strList = Arrays.stream(str.split(" ")).filter(x->x.length()%2==0).max(Comparator.comparingInt(String::length)).orElse("No String found");
		//System.out.println(strList);
		
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
		
		List<Employee> employDetail = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getName))
				.map(x->new Employee(x.getName().substring(0,2).toUpperCase()+x.getName().substring(2),x.getAge(),x.getDepartment())).collect(Collectors.toList());
				
				//System.out.println(employDetail);
		
		//findSecond highest Age
		Map<Integer, Optional<Employee>> collect34 = employees.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.collectingAndThen(Collectors.toList(), list->list.stream().sorted(
				Comparator.comparingInt(Employee::getAge).reversed()).skip(1).findFirst())));
		System.out.println("findSecond highest Age : "+collect34);
	
		//give the output as 1->1,2->8,3->27
				List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);	
				Map<Integer,Integer> mapStream = number.stream().collect(Collectors.toMap(x->x, x->x*x*x));
				//System.out.println(mapStream);
				
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
				List<Emplyoees> collect = listOfEmployeess.stream().filter(x->x.getSalary()>10).collect(Collectors.toList());
				//System.out.println(collect);
				
				//skip top 3 on the basis of salary  and print rest
				List<Emplyoees> collect2 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).skip(3).collect(Collectors.toList());
				//System.out.println(collect2);
				
				//Fetched top 3 salary
				List<Emplyoees> collect6 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).limit(3).collect(Collectors.toList());
				//System.out.println(collect6);
				
				//Given an employee list , sort employee based on there salary in descending order.
				List<Emplyoees> collect3 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
				//System.out.println(collect3);
				
				//How many male or female employee are there in company
				Map<String, Long> collect4 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
				//System.out.println(collect4);
				
				
				
				//Print the name of all department in the organization
				Map<String, List<Emplyoees>> collect5 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
				//System.out.println(collect5);
				
				
				
				//Average age of male and female employee
				Map<String, Double> collect7 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getAge)));
				//System.out.println(collect7);
				
				//get the detail of highest paid salary in the organization (if we want single output)
				Optional<Emplyoees> collect8 = listOfEmployeess.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emplyoees::getSalary)));
				//System.out.println(collect8);
				
				
				//get the name of employee who have joined after 2015
				List<Emplyoees> collect9 = listOfEmployeess.stream().filter(x->x.getDateOfjoining()>=2015).collect(Collectors.toList());
				//System.out.println(collect9);
				
				//Count the number of employee in each department
				Map<String, Long> collect10 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.counting()));
				//System.out.println(collect10);
				
				//What is the avarage salary of each department
				Map<String, Double> collect11 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.averagingDouble(Emplyoees::getSalary)));
				//System.out.println(collect11);
				
				//get the details of youngest male emloyee in product department (IT)
				Optional<Emplyoees> min = listOfEmployeess.stream().filter(x->x.getGender()=="Male"&& x.getDepartment()=="IT").min(Comparator.comparingDouble(Emplyoees::getAge));
				//System.out.println(min);
				
				//Who has the most working experience in the organization
				Optional<Emplyoees> max = listOfEmployeess.stream().max(Comparator.comparingDouble(Emplyoees::getDateOfjoining));
				//System.out.println(max);
				
				//how many male and female employee are there in sales and marketing departement
				Map<String, Long> collect12 = listOfEmployeess.stream().filter(x->"IT".equalsIgnoreCase(x.getDepartment()) || "HR".equalsIgnoreCase(x.getDepartment())).collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
				//System.out.println(collect12);
				// what is the average salary of male and female employee
				Map<String, Double> collect13 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getSalary)));
				//System.out.println(collect13);
				
				//List down name of all employee in each department
				Map<String, List<Emplyoees>> collect14 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
				Set<Entry<String, List<Emplyoees>>> entry = collect14.entrySet(); 
				for(Entry<String, List<Emplyoees>> en : entry) {
					en.getKey();
					//System.out.println(en.getKey()+": ");
					List<Emplyoees> value = en.getValue();
					//System.out.println(value.stream().map(Emplyoees::getName).collect(Collectors.toList()));
				}
				
				
				//list down average salary and total salary of the whole organization
				DoubleSummaryStatistics collect15 = listOfEmployeess.stream().collect(Collectors.summarizingDouble(Emplyoees::getSalary));
				//System.out.println("Get Average : "+collect15.getAverage()+"\nGet Sum : "+collect15.getSum());
				
				//Separate the employees who are younger or equal to 25 years from those employee who are older than 25 years.
				Map<Boolean, List<Emplyoees>> collect16 = listOfEmployeess.stream().collect(Collectors.partitioningBy(x->x.getAge()>=25));
				Set<Entry<Boolean, List<Emplyoees>>> entry1 = collect16.entrySet();
				for(Entry<Boolean, List<Emplyoees>> en :entry1 ) {
					//System.out.println("Younger than : "+en.getKey());
					List<Emplyoees> value = en.getValue();
					//System.out.println("Older value "+value.stream().collect(Collectors.toList()));
					
				}
				//listOfEmployeess.stream().collect(Collectors.partitioningBy(x->x.getAge()>=25)).forEach((x,y)->System.out.println("younger :"+x+" older :"+y));
				//System.out.println(collect16);
				
				//Who is the oldest employee in the organization and what is his age and from which departement?
				
				Optional<Emplyoees> max2 = listOfEmployeess.stream().max(Comparator.comparingDouble(Emplyoees::getAge));
				//System.out.println("Oldest Employee : "+max2);
				
				
				//Who is the oldest employee in all department and what is his age and from which departement?
				
				Map<String, Emplyoees> collect17 = listOfEmployeess.stream().collect(Collectors.groupingBy(
						Emplyoees::getDepartment,// Group by department
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingInt(Emplyoees::getAge)),// Get max age employee
								Optional::get)));//Convert Optional to actual Employee object
				//System.out.println(collect17);
				
				
				// All Element in list are Even
				List<Integer> numbers = Arrays.asList(3,5,7,8,6);
				List<Integer> collect18 = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
				//System.out.println(collect18);
				
				String st = "My name is Ashutosh kumar";
				String collect19 = st.chars().mapToObj(c->String.valueOf((char)c).toLowerCase())
						.filter(c->!c.equalsIgnoreCase(" ")).distinct().collect(Collectors.joining(", "));
				//System.out.println(collect19);
				
				// Convert list of integer to String
				List<Integer> number2 = Arrays.asList(1,5,6);
				List<String> collect20 = number2.stream().map(String::valueOf).collect(Collectors.toList());
				//System.out.println(collect20);
				
				//convert map to list of keys
				Map<String,Integer> map = Map.of("A",1,"B",2,"C",3);
				List<Entry<String, Integer>> collect21 = map.entrySet().stream().collect(Collectors.toList());
				//System.out.println(collect21);
				
				// Count Number of word in string
				String strm = "Java is very good language";
				long count = Arrays.stream(strm.split(" ")).count();
				//System.out.println(count);
				
				//Count occurrence of each char in string
				String srt ="banana";
				Map<Character, Long> collect22 = srt.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
				//System.out.println(collect22);
				
				// find the duplicate element form list
				List<Integer>  number0 = Arrays.asList(2,1,8,5,4,3,3,4,8,5,1);
				Set<Integer> value = new HashSet<>();
				List<Integer> collect23 = number0.stream().filter(x->!value.add(x)).collect(Collectors.toList());
				//System.out.println(collect23);
				
				// find the dublicate element in string
				String sentence = "Java is great and Java is powerful";
				List<String> collect24 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
				//System.out.println(collect24);
				
				// Find intersection of two list
				List<Integer> list1 = Arrays.asList(1,2,3,4);
				List<Integer> list2 = Arrays.asList(3,4,5,6);
				
				List<Integer> collect25 = list1.stream().filter(list2::contains).collect(Collectors.toList());
				//System.out.println(collect25);
				
				// Find longest word in the list
				List<String> strList1 = Arrays.asList("cat","Elephant","tiger");
				String lengthValue = strList1.stream().max(Comparator.comparingDouble(String::length)).orElse("Not Found");
				//System.out.println(lengthValue);
				
				// find all palindrom in list
				List<String> palindrom = Arrays.asList("level","java");
				List<String> collect26 = palindrom.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
				//System.out.println(collect26);
				
				// flatten the list under list into single list
				List<List<Integer>> listofList = Arrays.asList(Arrays.asList(5,6),Arrays.asList(2,3,5));
				List<Integer> collect27 = listofList.stream().flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
				//System.out.println(collect27);
				
				// Frequancy of woard
				
				String str2 = "apple banana apple orange banana";
				Map<String, Long> collect28 = Arrays.stream(str2.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()));
				//System.out.println(collect28);
				
				// Group element by string length
				List<String> str3 = Arrays.asList("cat","dog","hen","elephant","tiger","panda");
				Map<Integer, List<String>> collect29 = str3.stream().collect(Collectors.groupingBy(String::length));
				//System.out.println(collect29);
				
				//Left shift one
				int[] a = {1, 2, 3, 2, 4, 1, 1, 2, 1, 3, 1};
				IntStream one = Arrays.stream(a).filter(x->x==1);
				
				IntStream another = Arrays.stream(a).filter(x->x!=1);
				int[] result = IntStream.concat(one, another).toArray();
				//System.out.println(Arrays.toString(result));
				
				//Find Maximum number from list
				List<Integer> number3 = Arrays.asList(10,20,30,40,50);
				Integer orElseThrow = number3.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new);
				//System.out.println(orElseThrow);
				
				//list of random number
				List<Double> collect30 = new Random().doubles(5,0,10).boxed().collect(Collectors.toList());
				//System.out.println(collect30);
				
				// remove dublicate from list
				List<Integer> numberList = Arrays.asList(2,2,4,5,5,6,8,8);
				List<Integer> collect31 = numberList.stream().distinct().collect(Collectors.toList());
				//System.out.println(collect31);
				
				// Remove nulls
				List<String> str1 = Arrays.asList("ASD","dfg",null,"WER");
				List<String> collect32 = str1.stream().filter(Objects::nonNull).collect(Collectors.toList());
				//System.out.println(collect32);
				
				// reverse list
				List<Integer> numberRev = Arrays.asList(2,1,9,5,4,0);
				List<Integer> collect33 = numberRev.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				//System.out.println(collect33);
				
				// Second Highest Number
				List<Integer> numberSec = Arrays.asList(9,8,12,3,4,15);
				Integer orElseThrow2 = numberSec.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
				//System.out.println(orElseThrow2);
				
				//Find the second smallest number in a list
				List<Integer> secondSmall = Arrays.asList(10, 20, 5, 30, 15,15);
				Integer orElseThrow3 = secondSmall.stream().sorted().skip(1).findFirst().orElseThrow(NoSuchElementException::new);
				System.out.println(orElseThrow3);
				
				
				List<Employeee> list = Arrays.asList(
						new Employeee(1, "Alex", 1200),
						new Employeee(2, "Brian", 200),
						new Employeee(3, "Charles", 300),
						new Employeee(4, "David", 1000),
						new Employeee(5, "Edward", 500),
						new Employeee(6, "Frank", 700)
				);

				//0/p - 4, "David", 1000
				Optional<Employeee> first = list.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary()).skip(1).findFirst();
				first.ifPresent(System.out::println);
				
				
				
				//list.stream().sorted(Comparator.comparingDouble(Employeee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::print);
				//Employeee [id=4, name=David, salary=1000]
				//System.out.println(str1a);
				
				
				
				int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12};
				  int d=2;
				 //output: {12, 3, 5, 7, 2, 8, -1, 4, 10}
				  		// {10, 12, 3, 5, 7, 2, 8, -1, 4}
				  
				  int[] rotatedArray = rotateArray(array,d);
				  System.out.println(Arrays.toString(rotatedArray));
				  
				  //Find the first non-repeated character in a string
				  String input = "programming";
				  Character orElse = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
						  .entrySet().stream().filter(e->e.getValue() == 1)
				  .map(Map.Entry::getKey).findFirst().orElse(null);
				  System.out.println(orElse);
				  		
				  //Sort a list of strings by their length
				  List<String> strSortByLength = Arrays.asList("apple", "banana", "kiwi", "grape");
				  //strSortByLength.stream().sorted((s1,s2)->Integer.compare(s1.length(),s2.length())).forEach(System.out::println);
				  Map<Integer, List<String>> collect35 = strSortByLength.stream().collect(Collectors.groupingBy(String::length));
				  System.out.println(collect35);
				  
				  //Reverse each word in a sentence using Java 8
				  String sentence1 = "Java 8 is powerful";
				  String collect36 = Arrays.stream(sentence1.split(" ")).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
				  System.out.println(collect36);
				  
				  //Find duplicate elements in a list
				  List<String> names = Arrays.asList("Java", "Kotlin", "Java", "Scala", "Kotlin");
				  Set<String> collect37 = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(X->X.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
				  System.out.println(collect37);
				  
				  //Sort a Map by Its Values in Descending Order
				  
				  Map<String, Integer> mp = new HashMap<>();
				  mp.put("A", 1);
				  mp.put("B", 2);
				  mp.put("C", 3);
				  mp.put("D", 4);
				  
				  LinkedHashMap<String, Integer> sorted = mp.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
						  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
				  
				  System.out.println(sorted);
				  
				  //Find Max Salary Employee by Department
				  List<Employee1> employees1 = Arrays.asList(
				            new Employee1("Alice", "HR", 60000),
				            new Employee1("Bob", "IT", 80000),
				            new Employee1("Charlie", "HR", 70000),
				            new Employee1("David", "IT", 90000)
				        );
				  
				  Map<String, Optional<Employee1>> collect38 = employees1.stream()
				            .collect(Collectors.groupingBy(
				            		Employee1::getDepartment,
				                Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))
				            ));
				  collect38.forEach((dept, emp) -> 
		            System.out.println(dept + " -> " + emp.orElse(null)));
				 
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
					
				  
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	public static int[] rotateArray(int[] arr, int d){
		  int n = arr.length;
		  d=d%n; // Handle cases where d > n
		// Step 1: Reverse entire array
		  reverse(arr,0,n-1);
		 
		// Step 2: Reverse first d elements  
		  reverse(arr,0,d-1);
		
		// Step 3: Reverse remaining elements  
		  reverse(arr,d,n-1);
		  return arr;
		}

	private static void reverse(int[] arr,int start,int end) {
		  while(start<end) {
			  int temp = arr[start];
			  arr[start]=arr[end];
			  arr[end]=temp;
			  start++;
			  end--;
		  }
	}

}















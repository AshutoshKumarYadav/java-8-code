package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				List<Emplyoees> collect = listOfEmployeess.stream().filter(x->x.getSalary()>30).collect(Collectors.toList());
				System.out.println(collect);
				
				//skip top 3 on the basis of salary  and print rest
				List<Emplyoees> collect2 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).skip(3).collect(Collectors.toList());
				System.out.println(collect2);
				
				//Fetched top 3 salary
				List<Emplyoees> collect3 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).limit(3).collect(Collectors.toList());
				System.out.println(collect3);
				
				//How many male or female employee are there in company
				Map<String, Long> collect4 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
				System.out.println(collect4);
				
				//Print the name of all department in the organization
				//List<String> collect5 = listOfEmployeess.stream().map(Emplyoees::getDepartment).collect(Collectors.toList());
				Map<String, List<Emplyoees>> collect5 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
				System.out.println(collect5);
				
				//Average age of male and female employee
				Map<String, Double> collect6 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.averagingDouble(Emplyoees::getAge)));
				System.out.println(collect6);
				
				//get the detail of highest paid salary in the organization (if we want single output)
				List<Emplyoees> collect7 = listOfEmployeess.stream().sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed()).collect(Collectors.toList());
				System.out.println(collect7);
				
				Optional<Emplyoees> collect8 = listOfEmployeess.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emplyoees::getSalary)));
				System.out.println(collect8);
				
				//get the name of employee who have joined after 2015
				List<String> collect9 = listOfEmployeess.stream().filter(x->x.getDateOfjoining()>2015).map(Emplyoees::getName).collect(Collectors.toList());
				System.out.println(collect9);
				
				//Count the number of employee in each department
				Map<String, Long> collect10 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.counting()));
				System.out.println(collect10);
				
				//What is the avarage salary of each department
				Map<String, Double> collect11 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.averagingDouble(Emplyoees::getSalary)));
				System.out.println(collect11);
				
				//get the details of youngest male emloyee in product department (IT)
				Optional<Emplyoees> min = listOfEmployeess.stream().filter(x->x.getGender().equalsIgnoreCase("Male") && x.getDepartment().equalsIgnoreCase("IT")).min(Comparator.comparingInt(Emplyoees::getAge));
				System.out.println(min);
				
				List<Emplyoees> sorted = listOfEmployeess.stream().filter(x->x.getGender()=="Male" && x.getDepartment()=="IT").sorted(Comparator.comparingDouble(Emplyoees::getSalary)).collect(Collectors.toList());
				System.out.println(sorted);
				
				//Who has the most working experience in the organization
				Optional<Emplyoees> max = listOfEmployeess.stream().max(Comparator.comparingInt(Emplyoees::getDateOfjoining));
				System.out.println(max);
				
				//how many male and female employee are there in sales and marketing departement
				Map<String, Long> collect12 = listOfEmployeess.stream().filter(x->x.getDepartment().equalsIgnoreCase("Sales") || x.getDepartment().equalsIgnoreCase("Marketing")).collect(Collectors.groupingBy(Emplyoees::getGender,Collectors.counting()));
				System.out.println(collect12);
				
				// what is the average salary of male and female employee
				Map<String, Double> collect13 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getGender, Collectors.averagingDouble(Emplyoees::getSalary)));
				System.out.println(collect13);
				
				//List down name of all employee in each department
				Map<String, List<String>> collect14 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment,Collectors.mapping(Emplyoees::getName, Collectors.toList())));
				System.out.println(collect14);
				
				Map<String, List<Emplyoees>> collect15 = listOfEmployeess.stream().collect(Collectors.groupingBy(Emplyoees::getDepartment));
				Set<Entry<String, List<Emplyoees>>> entrySet = collect15.entrySet();
				for(Entry<String, List<Emplyoees>> en:entrySet) {
					List<Emplyoees> value = en.getValue();
					System.out.println(value.stream().map(Emplyoees::getName).collect(Collectors.toList()));
					
				}
				
				//list down average salary and total salary of the whole organization
				DoubleSummaryStatistics collect16 = listOfEmployeess.stream().collect(Collectors.summarizingDouble(Emplyoees::getSalary));
				System.out.println(collect16);
				
				//Separate the employees who are younger or equal to 25 years from those employee who are older than 25 years.
				Map<Boolean, List<String>> collect17 = listOfEmployeess.stream().collect(Collectors.partitioningBy(x->x.getAge()>=25,Collectors.mapping(Emplyoees::getName, Collectors.toList())));
				System.out.println(collect17);
				
				// get distinct char from String
				String s = "My name is Ashutosh kumar";
				String collect18 = s.chars().mapToObj(c->String.valueOf((char)c).toLowerCase()).distinct().collect(Collectors.joining(","));
				System.out.println(collect18);
				
				//String s = "find the first maximum length even word from String";
				String collect19 = Arrays.stream(s.split(" ")).filter(x->x.length()%2==0).max(Comparator.comparingInt(String::length)).orElse("Not Found");
				System.out.println(collect19);
				
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
				
				
				List<Employee> map = employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed().thenComparing(Employee::getName))
						.map(x-> new Employee(x.getName().substring(0,2).toUpperCase()+
						x.getName().substring(2),x.getAge(),x.getDepartment())).collect(Collectors.toList());
				System.out.println(map);
				
				//give the output as 1->1,2->8,3->27
				List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);	
				Map<Integer, Integer> collect20 = number.stream().collect(Collectors.toMap(x->x, x->x*x*x));
				System.out.println(collect20);
				
				// All Element in list are Even
				List<Integer> numbers = Arrays.asList(3,5,7,8,6);
				List<Integer> collect21 = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
				System.out.println(collect21);
				
				// Convert list of integer to String
				List<Integer> number2 = Arrays.asList(1,5,6);
				List<String> collect22 = number2.stream().map(String::valueOf).collect(Collectors.toList());
				System.out.println(collect22);
				
				//convert map to list of keys
				Map<String,Integer> map1 = Map.of("A",1,"B",2,"C",3);
				List<Entry<String, Integer>> collect23 = map1.entrySet().stream().collect(Collectors.toList());
				System.out.println(collect23);
				
				
				// Count Number of word in string
				String strm = "Java is very good language";
				long collect24 = Arrays.stream(strm.split(" ")).count();
				System.out.println(collect24);
				
				//Count occurrence of each char in string
				String srt ="banana";
				Map<Character, Long> collect25 = srt.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
				System.out.println(collect25);
				
				// find the duplicate element form list
				List<Integer>  number0 = Arrays.asList(2,1,8,5,4,3,3,4,8,5,1);
				Set<Integer> setNumber = new HashSet<Integer>();
				List<Integer> collect26 = number0.stream().filter(x->!setNumber.add(x)).collect(Collectors.toList());
				System.out.println(collect26);
				
				// find the dublicate element in string
				String sentence = "Java is great and Java is powerful";
				Set<String> setString = new HashSet<String>();
				List<String> collect27 = Arrays.stream(sentence.split(" ")).filter(x->!setString.add(x)).collect(Collectors.toList());
				System.out.println(collect27);
				
				
				List<String> collect28 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()))
						.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
				System.out.println(collect28);
				
				// Find intersection of two list
				List<Integer> list1 = Arrays.asList(1,2,3,4);
				List<Integer> list2 = Arrays.asList(3,4,5,6);
				
				List<Integer> collect29 = list1.stream().filter(list2::contains).collect(Collectors.toList());
				System.out.println(collect29);
				
				// Find longest word in the list
				List<String> strList1 = Arrays.asList("cat","Elephant","tiger");
				String orElse = strList1.stream().max(Comparator.comparing(String::length)).orElse("Not Found");
				System.out.println(orElse);
				
				// find all palindrom in list
				List<String> palindrom = Arrays.asList("level","java");
				List<String> collect30 = palindrom.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
				System.out.println(collect30);
				
				// flatten the list under list into single list
				List<List<Integer>> listofList = Arrays.asList(Arrays.asList(5,6),Arrays.asList(2,3,5));
				List<Integer> collect31 = listofList.stream().flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
				System.out.println(collect31);
				
				// Frequancy of woard
				
				String str2 = "apple banana apple orange banana";
				Map<String, Long> collect32 = Arrays.stream(str2.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
				System.out.println(collect32);
				
				// Group element by string length
				List<String> str3 = Arrays.asList("cat","dog","hen","elephant","tiger","panda");
				Map<Integer, List<String>> collect33 = str3.stream().collect(Collectors.groupingBy(String::length));
				System.out.println(collect33);
				
				//Left shift one
				int[] a = {1, 2, 3, 2, 4, 1, 1, 2, 1, 3, 1};
				IntStream filter = Arrays.stream(a).filter(x->x==1);
				
				IntStream filter2 = Arrays.stream(a).filter(x->x!=1);
				
				int[] array = IntStream.concat(filter, filter2).toArray();
				System.out.println(Arrays.toString(array));
				
				//Find Maximum number from list
				List<Integer> number3 = Arrays.asList(10,20,30,40,50);
				Integer orElseThrow = number3.stream().max(Integer::compareTo).orElseThrow();
				System.out.println(orElseThrow);
				
				// remove dublicate from list
				List<Integer> numberList = Arrays.asList(2,2,4,5,5,6,8,8);
				List<Integer> collect34 = numberList.stream().distinct().collect(Collectors.toList());
				System.out.println(collect34);
				
				// Remove nulls
				List<String> str1 = Arrays.asList("ASD","dfg",null,"WER");
				List<String> collect35 = str1.stream().filter(Objects::nonNull).collect(Collectors.toList());
				System.out.println(collect35);
				
				// reverse list
				List<Integer> numberRev = Arrays.asList(2,1,9,5,4,0);
				List<Integer> collect36 = numberRev.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				System.out.println(collect36);
				
				//Collections.reverse(numberRev);
				//System.out.println(Collections.reverse(numberRev));
				List<Integer> numberRev1 = Arrays.asList(2, 1, 9, 5, 4, 0);
				Collections.reverse(numberRev1); // reverses in-place
				System.out.println(numberRev1);  // prints the reversed list

				// Second Highest Number
				List<Integer> numberSec = Arrays.asList(9,8,12,3,4,15);
				Optional<Integer> collect37 = numberSec.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
				System.out.println(collect37);
				
				
				/*
				 * public class Singleton implements Serializable{ //volatile ensure that the
				 * changes across the thread instance private static volatile Singleton
				 * instance; private Singleton() { if(instance != null) { throw new
				 * IllegalStateException("Instance already created"); } } } public static
				 * Singleton getInstance() { if(instance==null) { synchronized(Singleton.class)
				 * { if(instance==null) { instance = new Singleton(); } } } return instance; }
				 * 
				 * // To prevent creating a new instance during deserialization private Object
				 * readResolve() throws ObjectStreamException { return getInstance(); }
				 */
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}

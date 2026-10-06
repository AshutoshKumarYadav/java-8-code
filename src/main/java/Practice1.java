import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import PracticeJava.Employee;
import PracticeJava.Emplyoees;

public class Practice1 {
    public static void main(String[] args) {
        //find maximum length
        String s = "find the first maximum length even word from String";
        Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
    
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
    
    
    // Sort the employee by age in reverse order
    List<Employee> sortedEmployeeOnAge= employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
    //System.out.println(sortedEmployeeOnAge);
    
    //Sort the employee by age in reverse order, first 2 alphabet in Capital letter,
	
	  List<Employee> collectName = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed().
	  thenComparing(Employee::getName)).map(x-> new
	  Employee(x.getName().substring(0,2).toUpperCase()
	  +x.getName().substring(2),x.getAge(),x.getDepartment())).collect(Collectors.
	  toList());
	  System.out.println(collectName);
	 
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
		List<Emplyoees> lstOfEmplSalGrtFifty = listOfEmployeess.stream().filter(x->x.getSalary()>50).collect(Collectors.toList());
		//System.out.println(lstOfEmplSalGrtFifty);
		
		//skip top 3 on the basis of salary  and print rest
		List<Emplyoees> listOfEmpSkipTop3 = listOfEmployeess.stream()
		        .sorted(Comparator.comparingDouble(Emplyoees::getSalary).reversed())
		        .skip(3) //limit
		        .collect(Collectors.toList());
		//System.out.println(listOfEmpSkipTop3);
		
		
		// Find the first non repeating character
		
		String input = "swiss";
		Character nonRepeating = input.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
		
		//System.out.println("First non repeating character : "+nonRepeating);
		
		//sort in ascending, and double digit shoul be the sum of it.
		List<Integer> list = Arrays.asList(5,4,7,56,23);
		
		List<Integer> listCollect = list.stream().map(Practice1::toSum).sorted().collect(Collectors.toList());
		//System.out.println("Sort in ascending, and double digit shoul be the sum of it: "+listCollect);
		
		// Find longest word in the list
		List<String> strList1 = Arrays.asList("cat","Elephant","tiger");
		String longestWord = strList1.stream().max(Comparator.comparingInt(String::length)).orElse("Not Found");
		//System.out.println("Find longest word in the list : "+longestWord);
		
		
		//2. Find duplicate characters
		String inputD = "programming";
		//inputD.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1)
		//.map(Map.Entry::getKey).forEach(System.out::println);
		
		//3. Count frequency of each character
		String inputFre = "hello";
		Map<Character,Long> countFre = inputFre.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println("Count frequency of each character : "+countFre);
		
		//4.Find duplicate numbers
		List<Integer> numbers =
		        Arrays.asList(10, 20, 10, 30, 20, 40);
		
		//numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
		
		HashSet<Integer> hashset = new HashSet<>();
		List<Integer> listHashset = numbers.stream().filter(x->!hashset.add(x)).collect(Collectors.toList());
		//System.out.println("Dublicate Element : "+listHashset);
		
		//Find second-highest number
		List<Integer> numbersSecond  =
		        Arrays.asList(10, 50, 30, 80, 60);
		
		Integer secondHighest = numbersSecond.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println("Second highest number : "+secondHighest);

        //6. Find third-highest salary
       Double thirdHighestSalary = listOfEmployeess.stream().map(Emplyoees :: getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
       //System.out.println("Third highest salary : "+thirdHighestSalary);
       
       //Reverse the string 
       String input1 = "java";
       
       String reverse = IntStream.range(0, input1.length()).mapToObj(i->input1.charAt(input1.length()-1-i)).map(String::valueOf).collect(Collectors.joining());
       //System.out.println(reverse);
       
       // find a string is palindrom
       String palandrom = "madam";
       boolean palindrom = IntStream.range(0, palandrom.length()/2).allMatch(i->palandrom.charAt(i)==palandrom.charAt(palandrom.length()-1-i));
       //System.out.println(palindrom);
       
       // find the sum by using reduce() method
       List<Integer> numbersReduce = Arrays.asList(10,20,30,40);
       int sum = numbersReduce.stream().reduce(0,(a,b)-> a+b);
       //System.out.println(sum);
       
       
       List<String> names = Arrays.asList(
    	        "Java",
    	        "Spring"
    	);
       
       List<String> result = names.stream()
    	        .flatMap(name -> Arrays.stream(name.split("")))
    	        .collect(Collectors.toList());

    	//System.out.println(result);
    	
    	//J a v a S p r i n g
       
       
       //LeetCode 3: Longest Substring Without Repeating Characters, but there are a few Java syntax and logic issues.
         String s1 = "abcabcbb";
         System.out.println(lengthOfLongestSubstring(s1));

       
       
       
       
       
       
       
       
       
       
       
       



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  
    
    
    
}
    
    public static int toSum(int value){
    	int sum =0;
    	while(value !=0) {
    		sum+=value%10;
    		value/=10;
    	}
    	return sum;
    	
    }
    public static int lengthOfLongestSubstring(String s) {
    Map<Character,Integer> map = new HashMap<>();
    int left = 0;
    int maxLength = 0;
    for(int right = 0; right < s.length(); right++){
        char c = s.charAt(right);
        if(map.containsKey(c)){
        left = Math.max(left,map.get(c)+1);
        }
        map.put(c,right);
        maxLength = Math.max(maxLength,right-left+1);

    }
    return maxLength;
    }





}
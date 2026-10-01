package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emplyoees> listOfEmployeess = new ArrayList<>();
		listOfEmployeess.add(new Emplyoees("Alice",30,"HR","female",10.00,2015,2016));
		listOfEmployeess.add(new Emplyoees("Ram",15,"IT","Male",20.00,2017,2020));
		listOfEmployeess.add(new Emplyoees("Ashutosh",12,"HR","female",10.00,2009,2021));
		
		List<String> collect = listOfEmployeess.stream().map(Emplyoees::getName).filter(x->x.startsWith("A")).collect(Collectors.toList());
		//System.out.println("********** collect : "+collect);

		Optional<Emplyoees> first = listOfEmployeess.stream().sorted(Comparator.comparingInt(Emplyoees::getDateOfjoining)).findFirst();
		//System.out.println("********** first : "+first);
		String str = "Welcome to Java world Welcome to india";
		//Map<String, Long> collect2 = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		//System.out.println("*************** collect2 "+collect2);
		
		//Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()))
			//	.entrySet().stream().filter(x->x.getValue()>1).forEach(x->System.out.println(x));
		
		//Tech Mehandra
		//List having student type and one student have more number of friends, find the first student name whose friend is more as compare to others by using java 8
		List<Students> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Students("Alice", Arrays.asList("Bob", "Charlie")));
        listOfStudents.add(new Students("Bob", Arrays.asList("Alice")));
        listOfStudents.add(new Students("Charlie", Arrays.asList("Alice", "Bob", "David")));
        listOfStudents.add(new Students("David", Arrays.asList("Charlie")));
        
        Optional<Students> studentWithMostFriends = listOfStudents.stream()
            .max((s1, s2) -> Integer.compare(s1.getFriends().size(), s2.getFriends().size()));
        
        studentWithMostFriends.ifPresent(s -> System.out.println("Student with most friends: " + s.getName()));
        
        
        
        
		
		
	}

}

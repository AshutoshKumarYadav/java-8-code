package PracticeJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeustBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to the world";
		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(collect);
		//s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
				//SOp(als)

				//Character  asd = s.chars().mapToObj(c->(char)c).filter(x->x.equals('a','i','o','e','u')).collect(Collectors.toList());
				//SOP(asd);
		List<Character> collect2 = s.chars().mapToObj(c->(char)c).filter(c -> "aeiouAEIOU".indexOf(c) != -1).collect(Collectors.toList());
		System.out.println(collect2);
		
		// Find longest word in the list
		List<String> strList1 = Arrays.asList("cat","Elephant","tiger");
		List<Integer> collect3 = strList1.stream().map(String::length).collect(Collectors.toList());
		String orElse = strList1.stream().max(Comparator.comparing(String::length)).orElse("Not Found");
		System.out.println(orElse);
		System.out.println(collect3);
		
		// find all palindrom in list
		List<String> palindrom = Arrays.asList("level","java");
		List<String> collect4 = palindrom.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
		System.out.println(collect4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
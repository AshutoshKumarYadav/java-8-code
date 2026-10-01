package PracticeJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LTIMindtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,7,8};
		int[] b= {6,7,4,3};
		//merge this two array into single one
		int[] array = Arrays.stream(new int[][] {a,b}).flatMapToInt(Arrays::stream).toArray();
		Arrays.stream(array).forEach(x->System.out.print(x+" \n"));
		
		
		String str ="Ashutosh";
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		List<Character> collect2 = collect.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect2);
		
		//longest string
		List<String> prefixWord = Arrays.asList("flower","flow","flight");
		String longestString = prefixWord.stream()
		.reduce((a1,b1)-> {
			int i = 0;
		while(i<a1.length() && i<b1.length() && a1.charAt(i)==b1.charAt(i)) {
			i++;
		}
		return a1.substring(0,1);	
		}).orElse("No String Found");
		//System.out.println("Longest String "+longestString);
		
		// 0 to be right and 1 to be left
		List<Integer> numbers = Arrays.asList(0, 1, 0, 3, 12,4,0,5,10);
		Stream<Integer> filter = numbers.stream().filter(x->x==0);
		Stream<Integer> filter2 = numbers.stream().filter(x->x!=0);
		List<Integer> array2 = Stream.concat(filter2, filter).toList();
		System.out.println(array2);
		
		//Print the current date and time in format 12/30/2022 12:30:42
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dateTimefor = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String format = localDate.format(dateTimefor);
		System.out.println(format);
		
		//sort in ascending, and double digit shoul be the sum of it.
		List<Integer> ls = Arrays.asList(5,4,7,56,23);
		List<Object> collect3 = ls.stream().map(LTIMindtree::sumOfTwoDigit).sorted().collect(Collectors.toList());
		System.out.println(collect3);
		
		// Find longest word in the list
		List<String> strList1 = Arrays.asList("cat","Elephant","tiger");
		String orElse = strList1.stream().max(Comparator.comparing(String::length)).orElse("Not Found");
		System.out.println(orElse);
		
		// find all palindrom in list
		List<String> palindrom = Arrays.asList("level","java");
		List<String> collect4 = palindrom.stream().filter(x->x.equals(new StringBuilder(x).reverse().toString())).collect(Collectors.toList());
		System.out.println(collect4);
		
		List<String> palindrom1 = Arrays.asList("level","java","level@#$","java@#$");
		List<String> palindromes = palindrom1.stream()
	            .map(s -> s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()) // Clean the string
	            .filter(s -> !s.isEmpty() && s.equals(new StringBuilder(s).reverse().toString())) // Check palindrome
	            .collect(Collectors.toList());

	        System.out.println("Cleaned Palindromes: " + palindromes);
	    
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static int sumOfTwoDigit(int num){
		int sum = 0;
		while(num != 0) {
			sum+=num%10;
			num /= 10;
		}
		return sum;
	}

}



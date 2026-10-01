package PracticeJava;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.stream.events.Characters;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find the second smallest number in a list
		List<Integer> secondSmall = Arrays.asList(10, 20, 5, 30, 15,15);
		Integer secondSmallNumber = secondSmall.stream().sorted().distinct().skip(1).findFirst().orElseThrow(NoSuchElementException::new);
		//System.out.println("******* secondSmallNumber :"+secondSmallNumber);
		
		//Check if a list contains only unique elements
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4);
		boolean allUnique = numbers.stream().distinct().count() ==numbers.size();
		//System.out.println("******* allUnique :"+allUnique);
		
		//Find the longest word in a string sentence
		String sentence = "Java 8 streams are amazing";
		String longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
		//System.out.println("********** Longest Word: : "+longestWord);
		
		//43. Find the average length of words in a sentence
		String sentence1 = "Java 8 streams are amazing";
		double averageLength = Arrays.stream(sentence1.split(" ")).mapToInt(String::length).average().orElse(0.0);
		//System.out.println("******************** averageLength : "+averageLength);
		
		//Remove duplicate words from a sentence
		String sentence2 = "hello world hello java world";
		List<String> str = Arrays.stream(sentence2.split(" ")).distinct().collect(Collectors.toList());
		//System.out.println("************************** str :"+str);
		
		//Group even and odd numbers from a list
		List<Integer> numbers1 = Arrays.asList(1, 5, 3, 10, 8, 7);
		Map<Object, List<Integer>> list = numbers1.stream().collect(Collectors.groupingBy(x->x%2==0));
		//System.out.println("************ list : "+list);
		
		Map<Boolean, List<Integer>> list1 = numbers1.stream().collect(Collectors.partitioningBy(x->x%2==0));
		//System.out.println("************ list : "+list1);
		
		//Find the top 3 highest numbers from a list
		List<Integer> topThree = numbers1.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		//System.out.println("********** topThree "+topThree);
		
		//Remove vowels from a given string
		String input = "Java 8 Streams are powerful";
		String resuylt = input.chars().mapToObj(x->(char)x).filter(x->!"aeiouAEIOU".contains(x.toString())).map(String::valueOf).collect(Collectors.joining());
		//System.out.println("****************** Remove vowels from a given string : "+resuylt);
		
		//Count the frequency of characters in a string
		String input1 = "programming";
		Map<Object, Long> result = input1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		//System.out.println("************ Count the frequency of characters in a string : "+result);
		
		//Find the sum of even numbers from a list
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		int listNumaber = numbers2.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		//System.out.println(listNumaber);
		
		// Find distinct characters in a string ignoring case
		String inpu3t = "Java Stream Example";
		Set<Character> strResult = inpu3t.toLowerCase().chars().mapToObj(x->(char)x).filter(x->Character.isLetter(x)).collect(Collectors.toSet());
		//System.out.println("*************** strResult : "+strResult);
		
		//Find the most frequent word in a list
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		String mostFrequentWord = words.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		//System.out.println("*********** mostFrequentWord "+mostFrequentWord );
		
		//Concatenate two lists
		List<String> list2 = Arrays.asList("a", "b");
		List<String> list3 = Arrays.asList("c", "d");
		List<String> concate =  Stream.concat(list2.stream(), list3.stream()).collect(Collectors.toList());
		//System.out.println(concate);
		
		//Reverse a list using streams
		
		List<Integer> listA = Arrays.asList(1,2,3,4,5);
		List<Integer> lists = IntStream.range(0, listA.size()).mapToObj(x->listA.get(listA.size()-x-1)).collect(Collectors.toList());
		//System.out.println("Reversed List : "+lists);
		
		//Find the sum of digits of a number using streams
		
		int number = 12345;
		int sum = String.valueOf(number).chars().map(Character::getNumericValue).sum();
		//System.out.println("Sum of digits of a number using streams : "+sum);
		
		//Merge two maps, summing values if keys are the same
		Map<String,Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
		Map<String,Integer> map2 = Map.of("B",3,"C",4,"D",5);
		
		Map<String,Integer> map3 = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,Integer::sum));
		//System.out.println("Merge two maps, summing values if keys are the same : "+map3);
		
		//Find the most frequent character in a string
		String inputJ = "hellojava";
		Character inputAns = inputJ.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		//System.out.println("Find the most frequent character in a string : "+inputAns);
		
		//Sort a list of strings by length and then alphabetically
		List<String> wordsLen = Arrays.asList("apple", "banana", "kiwi", "cherry");
		List<String> wordsSorted =  wordsLen.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
		//System.out.println("*** Sort a list of strings by length and then alphabetically : "+wordsSorted);
		
		//Parallel processing: Compute sum of squares of large numbers
		List<Integer> numberss = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
		int numbersT = numberss.parallelStream().mapToInt(x->x*x).sum();
		//System.out.println("************ Parallel processing: Compute sum of squares of large numbers : "+numbersT);
		
		//Find all substrings of a string using Streams
		String inputt = "abc";
		List<String> subString = IntStream.range(0, inputt.length()).boxed().flatMap(i->IntStream.range(i+1, inputt.length()+1).mapToObj(j->inputt.substring(i,j))).collect(Collectors.toList());
		//System.out.println("*********** subString : "+subString);
		
		//Find the common elements between two arrays using Streams 
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
		
		Set<Integer> commom = Arrays.stream(arr1).boxed().filter(num->Arrays.stream(arr2).anyMatch(x->x==num)).collect(Collectors.toSet());
		//System.out.println("********* common elements between two arrays using Streams  "+commom);
		
		//Convert nested list to flat list
		List<List<Integer>> listMulti = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9)
				);
		List<Integer> listOne = listMulti.stream().flatMap(List::stream).collect(Collectors.toList());
		//System.out.println("******************* listOne : "+listOne);
		
		//Check if a number is a palindrome using Streams
		int palindrom = 12321;
		boolean result1 = Integer.toString(palindrom).equals(new StringBuilder(Integer.toString(palindrom)).reverse().toString());
		//System.out.println("*************** result1 "+result1);
		
		
		//Compute factorial of a number using Streams
		int numberOne = 5;
		int resultOfFactorial = IntStream.rangeClosed(1, numberOne).reduce(1,(a,b)-> a*b);
		//System.out.println("*********** resultOfFactorial : "+resultOfFactorial);
		
		//Generate an infinite Fibonacci sequence using Streams
		
		//Stream.iterate(new int[] {0,1}, fib->new int[] {fib[1],fib[0]+fib[1]}).limit(10).map(fib->fib[0]).forEach(System.out::print);
		
		List<String> countries = Arrays.asList("Russia", "India", "China", "Japan", "China", "india", "", "Ghana");
		List<String> countrieUnique = countries.stream().map(String::trim).filter(x->!x.isEmpty()).map(String::toLowerCase).distinct().collect(Collectors.toList());
		System.out.println("**************** countrieUnique : "+countrieUnique);
		
		
		

	}
	
	
}

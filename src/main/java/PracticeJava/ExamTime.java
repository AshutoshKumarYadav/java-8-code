package PracticeJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamTime {

	public static void main(String[] args) {
		
		//int[] c = {};
		//int[] array = Arrays.stream(new int[][] {a,b}).flatMapToInt(Arrays::stream).toArray();
		//Arrays.stream(array).forEach(x->System.out.print(x+" "));
		//System.out.println(array.toString());
		
		// merge two list
		List<Integer> list1 = Arrays.asList(3, 5, 7, 8);
        List<Integer> list2 = Arrays.asList(6, 7, 4, 3);
        List<Integer> collect3 = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		
		String str ="Ashutosh";
		Map<Character, Long> collect = str.chars().mapToObj(d->(char)d).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(collect);
		List<Character> collect2 = collect.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> prefixWord = Arrays.asList("flower","flow","flight");
		String longestCommonPrefix = prefixWord.stream()
                .reduce((a1, b1) -> {
                    int i = 0;
                    // Compare characters of both strings until mismatch
                    while (i < a1.length() && i < b1.length() && a1.charAt(i) == b1.charAt(i)) {
                        i++;
                    }
                    return a1.substring(0, i); // return the common prefix between a and b
                })
                .orElse(""); // Return empty string if list is empty

        System.out.println("Longest common prefix: " + longestCommonPrefix);
		
	}

}

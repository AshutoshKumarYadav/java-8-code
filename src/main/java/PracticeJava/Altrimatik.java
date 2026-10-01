package PracticeJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Altrimatik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4, 3, 2, 7, 8, 2, 3, 1};
		DuplicateFinder(arr);
		
		List<Integer> lists = Arrays.asList(1,3,4,6,5,7);
		doubleNum(lists);
	}
	public static void DuplicateFinder(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> dublicates = new HashSet<>();
		for(int num : arr) {
			if(!seen.add(num)) {
				dublicates.add(num);
			}
		}
		System.out.println("Duplicates: "+dublicates);
	}
	//Given a list of integers, square the even numbers and return the result in descending order.
	
	
	public static void doubleNum(List<Integer> lists) {
		List<Integer> collect = lists.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println(collect);
	}

}

package PracticeJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HCLExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sort in ascending, and double digit shoul be the sum of it.
		List<Integer> ls = Arrays.asList(5,4,7,56,23);
		List<Integer> collect = ls.stream().map(HCLExam::sumOfTwo).sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		
		
	}
	public static int sumOfTwo(int num) {
		int sum = 0;
		while(num !=0) {
			sum += num%10;
			num /=10;
		}
		return sum;
		
	}

}

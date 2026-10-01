package PracticeJava;
import java.util.Arrays;
import java.util.List;

public class SumOfAllNumberFrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sum of all number present in list
		List<Integer> number = Arrays.asList(5,4,3,2);
		int sumNumber=number.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sumNumber);
	}

}

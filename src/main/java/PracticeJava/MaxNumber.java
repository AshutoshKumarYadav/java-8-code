package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find Maximum number from list
		List<Integer> number = Arrays.asList(10,20,30,40,50);
		Integer maxNumber = number.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new);
		System.out.println(maxNumber);
	}

}

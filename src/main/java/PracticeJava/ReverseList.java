package PracticeJava;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse list
		List<Integer> number = Arrays.asList(2,1,9,5,4,0);
		List<Integer> sorted = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sorted);
	}

}

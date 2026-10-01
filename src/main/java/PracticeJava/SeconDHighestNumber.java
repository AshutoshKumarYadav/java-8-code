package PracticeJava;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class SeconDHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Second Highest Number
		List<Integer> number = Arrays.asList(9,8,12,3,4,15);
		int numberSec = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(NoSuchElementException::new);
		System.out.println(numberSec);
	}

}

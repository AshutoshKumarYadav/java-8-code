package PracticeJava;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInReversOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sort in reverse order
		List<Integer> listofInteger = Arrays.asList(5,6,7,2,3);
		List<Integer> numberInreverse =listofInteger.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(numberInreverse);
		
	}

}

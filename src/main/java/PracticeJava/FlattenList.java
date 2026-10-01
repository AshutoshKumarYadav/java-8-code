package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// flatten the list under list into single list
		List<List<Integer>> listofList = Arrays.asList(Arrays.asList(5,6),Arrays.asList(2,3,5));
		List<Integer> singleList = listofList.stream().flatMap(List::stream).sorted().distinct().collect(Collectors.toList());
		System.out.println(singleList);
	}

}

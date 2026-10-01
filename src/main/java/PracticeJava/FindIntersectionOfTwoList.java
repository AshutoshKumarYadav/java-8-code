package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIntersectionOfTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find intersection of two list
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(3,4,5,6);
		List<Integer> listNum = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(listNum);
	}

}

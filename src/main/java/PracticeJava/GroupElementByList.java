package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElementByList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Group element by string length
		List<String> str = Arrays.asList("cat","dog","hen","elephant","tiger","panda");
		Map<Integer,List<String>> collectedStr = str.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collectedStr);
	}

}

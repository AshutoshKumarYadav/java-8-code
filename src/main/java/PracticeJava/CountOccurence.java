package PracticeJava;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count occurrence of each char in string
		String srt ="banana";
		Map<Character,Long>  count = srt.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(count);
	}

}

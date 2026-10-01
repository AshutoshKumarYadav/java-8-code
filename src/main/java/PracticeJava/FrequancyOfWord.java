package PracticeJava;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequancyOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Frequancy of woard
		
		String str = "apple banana apple orange banana";
		Map<String,Long> frequancyWord = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(frequancyWord);
	}

}

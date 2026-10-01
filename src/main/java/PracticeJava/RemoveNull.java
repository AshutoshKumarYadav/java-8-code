package PracticeJava;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remove nulls
		List<String> str = Arrays.asList("ASD","dfg",null,"WER");
		List<String> removeNull = str.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(removeNull);
	}

}

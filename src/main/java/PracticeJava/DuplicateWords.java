package PracticeJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java is great and Java is powerful";
		List<String> dublicates = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("********* dublicates "+dublicates);
	}

}

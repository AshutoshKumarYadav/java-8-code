package PracticeJava;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapTolistKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert map to list of keys
		Map<String,Integer> map = Map.of("A",1,"B",2,"C",3);
		List<String> str= map.keySet().stream().collect(Collectors.toList());
		System.out.println(str.stream().sorted().collect(Collectors.toList()));
	}

}

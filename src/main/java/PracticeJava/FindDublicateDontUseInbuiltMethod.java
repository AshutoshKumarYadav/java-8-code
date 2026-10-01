package PracticeJava;
import java.util.HashSet;
import java.util.Set;

public class FindDublicateDontUseInbuiltMethod {
	
public static Set<Integer> findDublicta(int[] arr){
		
		Set<Integer> uniqueNumber = new HashSet<>();
		Set<Integer> uniqueNumberAdded = new HashSet<>();
		
		for(int c:arr) {
			
			if(!uniqueNumber.add(c)) {
				uniqueNumberAdded.add(c);
			}
		}
		return uniqueNumberAdded;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find dublictae don't use inbuild method
		
		int arra[] = {1,3,2,5,2,6,7,5,};
		Set<Integer> uniqueNumberAdded = findDublicta(arra);
		System.out.println(uniqueNumberAdded);
	}
	

}

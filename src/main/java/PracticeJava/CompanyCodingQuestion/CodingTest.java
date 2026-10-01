package PracticeJava.CompanyCodingQuestion;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="w4a3d1e1x6";
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i=0;i<str.length();i+=2) {
			
			char ch = str.charAt(i);
			// Convert the next character (digit) to an integer
			
			int count = Character.getNumericValue(str.charAt(i+1));
			 // Append 'ch' 'count' times to the StringBuilder
			for(int j=0;j<count;j++) {
				stringBuilder.append(ch);
			}
			
		}
		System.out.println(stringBuilder.toString());
	}

}

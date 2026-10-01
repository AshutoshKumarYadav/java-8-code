package PracticeJava.MultiThreading;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABC";
		//Permu.permutation(str,"");
		System.out.println("StaireCaseProblemMethod");
		
		int stairs = 4;
		int jump = 3;
		System.out.println("Ways to climb stairs : "+StairP.countWays(stairs,jump));
		//StairP.countWays(4, 3);
	}



}
class Permu{
	static void permutation(String str, String result) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			//System.out.println("Current : "+current);
			String remaining = str.substring(0,i)+str.substring(i+1);
			//System.out.println("remaining :"+remaining);
			permutation(remaining,result+current);
		}
		
	}
}

class StairP {
	//[31, 22, 211, 13, 121, 112, 1111]  = 4 stairs
	
	
	public static int countWays(int stairs,int jump) {
		if(stairs==0) return 1;
		if(stairs<0) return 0;
		
		int totalWays = 0;
		for(int i=1;i<=jump;i++) {
			totalWays+= countWays(stairs-i,jump);
			System.out.println(totalWays);
		}
		return totalWays;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}












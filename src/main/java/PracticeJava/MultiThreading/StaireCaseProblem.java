package PracticeJava.MultiThreading;

public class StaireCaseProblem {
	//[31, 22, 211, 13, 121, 112, 1111]  = 4 stairs
	
	
	public static void main(String[] args) {
		System.out.println("StaireCaseProblemMethod");
		int stairs=4;
		int jump=3;
		System.out.println("Ways to climb stairs : "+countWays(stairs,jump));
		
		
	}
	public static int countWays(int stairs,int jump) {
		if(stairs==0) return 1;
		if(stairs<0) return 0;
		
		int totalWays=0;
		for(int i=1;i<=jump;i++) {
			totalWays+= countWays(stairs-i,jump);
		}
		return totalWays;
		
	}
	
	
}
		
	

	
	




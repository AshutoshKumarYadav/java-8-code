import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
       // Scanner sc=new Scanner(System.in);
       // String A=sc.next();
        //String B=sc.next();
    	
    	String A = "hello";
    	String B = "java";
        /* Enter your code here. Print output to STDOUT. */
        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println(Integer.valueOf(lengthA)+Integer.valueOf(lengthB));
        int result = A.compareTo(B);
        if(result>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" ".concat(B.substring(0,1).toUpperCase()+B.substring(1)));
    }
 
}




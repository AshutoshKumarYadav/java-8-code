package PracticeJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class pwc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(FirstNonRepeating.firstNonRepeatingChar("swiss"));
		int[] arr = {7,5,4,3,6};
		int target = 9;
		System.out.println(Arrays.toString(TwoSum.findTwoSum(arr,target)));
		
		//System.out.println(ReverseList.reverse(5));
	}
	
	public class FirstNonRepeating{
		public static Character firstNonRepeatingChar(String s) {
			Map<Character,Integer> map = new LinkedHashMap<>();
			
			for(char ch: s.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
				System.out.println(map);
			}
			for(Map.Entry<Character, Integer> entry : map.entrySet()) {
				if(entry.getValue()==1) {
					return entry.getKey();
				}
				
			}
			return null;
		}
		
		

		
		
		
		
		
		
	}
	//******************************************************************
	
	
			public class TwoSum{
				public static int[] findTwoSum(int[] nums,int target) {
					Map<Integer,Integer> map = new HashMap<>();
					for(int i=0;i<nums.length;i++) {
						int rem = target - nums[i];
						if(map.containsKey(rem)) {
							return new int[] {map.get(rem),i};
						}
						map.put(nums[i], i);
					}
					return new int[] {-1,-1};
					
				}
			}
			//******************************************************************
			
			//Reverse a Linked List
			
			class Node{
				int data;
				Node next;
				
				Node(int data){
					this.data=data;
				}
			}
			public class ReverseList {
				public static Node reverse(Node head) {
					Node prev=null,curr=head;
					while(curr!=null) {
						Node nextTemp = curr.next;
						curr.next = prev;
						prev=curr;
						curr=nextTemp;
						
					}
					return prev;
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			

}


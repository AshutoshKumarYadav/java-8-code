package PracticeJava;

import java.util.HashMap;
import java.util.Map;

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//You can return the answer in any order.
				 
				 
				//Example 1:
				 
				//Input: nums = [2,7,11,15], target = 9
				//Output: [0,1]
				//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
				//Example 2:
				 
				//Input: nums = [3,2,4], target = 6
				//Output: [1,2]
		int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]");
	
	}
	public static int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}else {
				map.put(nums[i],i);
			}
			
		}
		throw new IllegalArgumentException("No solution found");
	}

}

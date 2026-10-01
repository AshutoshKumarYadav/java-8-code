import java.util.Map;

public class SumOfTwoNumberReturnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numss = {2,7,11,15};
		twoSum(numss,7);
	}
	//Sum of two number, return the index of two
	public int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<=nums.length;i++) {
			int diff = target-nums[i];
			
			if(map.containsKey(diff)) {
				retun new int[] {map.get(diff),i};
			}
			map.put(nums[i], i);
		}
		return null;
	}

}

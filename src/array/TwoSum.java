package array;
/**
 * Given an array of integers, return indices 
 * of the two numbers such that they add up to a specific target.
 *
 * @author£º charles
 * @date£º 2019-07-30 23:43
 */
public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        int[] result=new int[2];
	        for(int i=0;i<nums.length;i++) {
	        	int temp=target-nums[i];
	        	for(int j=i+1;j<nums.length;j++) {
	        		if(nums[j]==temp) {
	        			result[0]=i;
	        			result[1]=j;
	        			break;
	        		}
	        	}
	        }
	        return result;
	    }
}

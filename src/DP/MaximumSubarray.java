package DP;
/**
 * Given an integer array nums, 
 * find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 *
 * sum[i+1]=max(sum[i]+num[i+1],num[i+1]);
 * 
 *
 * @author£º charles
 * @date£º 2019-08-17 00:12
 */
public class MaximumSubarray {
	public static int maxSubArray(int[] nums) {
	        int sum=nums[0],result=nums[0];
	        for(int i=1;i<nums.length;i++) {
	        	sum=sum>0?sum+nums[i]:nums[i];
	        	result=sum>result?sum:result;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSubarray.maxSubArray(nums));
	}
}

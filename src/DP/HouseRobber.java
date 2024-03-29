package DP;
/**
 *
 *
 * @author�� charles
 * @date�� 2019-08-26 16:10
 */
public class HouseRobber {
	public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return nums[0]>nums[1]?nums[0]:nums[1];
		int[] dp=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=nums[0]>nums[1]?nums[0]:nums[1];
		for(int i=2;i<nums.length;i++) {
			dp[i]=dp[i-1]>dp[i-2]+nums[i]?dp[i-1]:dp[i-2]+nums[i];
		}
		return dp[nums.length-1];
	}
}

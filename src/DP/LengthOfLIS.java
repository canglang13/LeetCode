package DP;

import java.util.Arrays;

/**
 * O(n2)
 *
 *
 * @author£º charles
 * @date£º 2019-08-19 00:02
 */
public class LengthOfLIS {
	public static int lengthOfLIS(int[] nums) {
		int[] dp=new int[nums.length];
		Arrays.fill(dp, 1);
		int len=dp[0];
	    for(int i=0;i<nums.length;i++) {
	    	for(int j=0;j<i;j++) {
	    		if(nums[j]<nums[i]) {
	    			dp[i]=dp[i]>dp[j]+1?dp[i]:dp[j]+1;
	    		}
	    	}
	    	len=len>dp[i]?len:dp[i];
	    }
	    return len;
	}
	public static void main(String[] args) {
		int[] nums= {10,9,2,5,3,7,101,18};
		System.out.print(LengthOfLIS.lengthOfLIS(nums));
	}
}

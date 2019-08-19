package 二分法;

import java.util.Arrays;

/**
 * 
 * O(nlogn) 贪心+二分查找
 * dp[i] 长度为i+1的LIS的最小结尾元素
 *
 * @author： charles
 * @date： 2019-08-19 00:30
 */
public class LengthOfLIS02 {
	public static int lengthOfLIS(int[] nums) {
        //if(nums.length==0) return 0;
		int[] dp=new int[nums.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=nums[0];
		int ans=0;
		int start,end,temp;
	    for(int i=0;i<nums.length;i++) {
	    	if(nums[i]>dp[ans]) {
	    		ans++;
	    		dp[ans]=nums[i];
	    	}
	    	else {//二分查找
	    		//System.out.print("in...");
	    		start=0;end=ans;
	    		while(start<=end) {
	    			temp=start+(end-start)/2;
	    			if(dp[temp]==nums[i]) {
	    				start=temp;
	    				break;
	    			}
	    			if(dp[temp]<nums[i]) {
	    				start=temp+1;
	    			}
	    			if(dp[temp]>nums[i]) {
	    				end=temp-1;
	    			}
	    		}
	    		if(dp[start]>nums[i])
	    		dp[start]=nums[i];
	    		//System.out.print("dp"+start+":"+dp[start]+" ");
	    	}
	    	//System.out.print("dp"+ans+":"+dp[ans]+" ");
	    	//for(int k=0;k<=ans;k++) {
		    	//System.out.print("dp"+k+":"+dp[k]+" ");
		    //}
	    	//System.out.print("\n");
	    }
	    
	    return ans+1;
	}
	public static void main(String[] args) {
		int[] nums= {10,9,2,5,3,7,101,18};
		System.out.println("--->"+LengthOfLIS02.lengthOfLIS(nums));
	}
}

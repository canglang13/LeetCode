package DP;
/**
 *  :考虑 正负
 *  :保存每个nums元素结尾的子序列的最大值和最小值
 * if(nums[i]<=0) dpmax[i]=max(dpmin[i-1]*nums[i],nums[i]);
 * 				  dpmin[i]=min(dpmax[i-1]*nums[i],nums[i]);
 * if(nums[i]>0)  dpmax[i]=max(dpmax[i-1]*nums[i],nums[i]);
 * 			      dpmin[i]=min(dpmin[i-1]*nums[i],nums[i]);
 *
 * @author： charles
 * @date： 2019-08-26 13:56
 */
public class MaximumProductSubarray {
	/*public static int maxProduct(int[] nums) {
		int len=nums.length;
		int[] dpmax=new int[len];
		int[] dpmin=new int[len];
		int result=0;
		dpmax[0]=nums[0];
		dpmin[0]=nums[0];
		for(int i=1;i<len;i++) {
			if(nums[i]<=0) {
				dpmax[i]=dpmin[i-1]*nums[i]>nums[i]?dpmin[i-1]*nums[i]:nums[i];
				dpmin[i]=dpmax[i-1]*nums[i]<nums[i]?dpmax[i-1]*nums[i]:nums[i];
			}
			else {
				dpmax[i]=dpmax[i-1]*nums[i]>nums[i]?dpmax[i-1]*nums[i]:nums[i];
				dpmin[i]=dpmin[i-1]*nums[i]<nums[i]?dpmin[i-1]*nums[i]:nums[i];
			}
			result=result>dpmax[i]?result:dpmax[i];	
		}
		return result;
	}*/
	public static int maxProduct(int[] nums) {
		int len=nums.length;
		int dpmax1,dpmax2,dpmin1,dpmin2;
		int result=0;
		dpmax1=nums[0];
		dpmin1=nums[0];
		for(int i=1;i<len;i++) {
			if(nums[i]<=0) {
				dpmax2=dpmin1*nums[i]>nums[i]?dpmin1*nums[i]:nums[i];
				dpmin2=dpmax1*nums[i]<nums[i]?dpmax1*nums[i]:nums[i];
			}
			else {
				dpmax2=dpmax1*nums[i]>nums[i]?dpmax1*nums[i]:nums[i];
				dpmin2=dpmin1*nums[i]<nums[i]?dpmin1*nums[i]:nums[i];
			}
			result=result>dpmax2?result:dpmax2;	
			dpmax1=dpmax2;dpmin1=dpmin2;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a= {2,3,-2,4};
		System.out.println(maxProduct(a));
	}
}

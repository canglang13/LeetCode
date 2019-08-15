package array;

/**
 * Given an array, rotate the array to the right by k steps, 
 * where k is non-negative.
 *
 * @author£º charles
 * @date£º 2019-08-01 11:18
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) {
		if(k>nums.length) {
			k=k%nums.length;
		}
        int[] p=new int[nums.length-k];
        int[] t=new int[k];
        for (int i=0;i<nums.length-k;i++) {
        	p[i]=nums[i];
        }
        for (int i=0;i<k;i++) {
        	t[i]=nums[nums.length-k+i];
        }
        for (int i=0;i<k;i++) {
        	nums[i]=t[i];
        }
        for(int i=k;i<nums.length;i++) {
        	nums[i]=p[i-k];
        }
    }
	public static void main(String[] args) {
		int[] a= {1,2,3};
		rotate(a,2);
		for(int i=0;i<3;i++)
		System.out.println(a[i]);
	}
}

package array;

public class RotateArray01 {
	 public static void rotate(int[] nums, int k) {
	        int temp;
	        int l=nums.length;
	        for(int i=0;i<k;i++){
	            temp=nums[l-1];
	            for(int j=l-1;j>0;j--){
	                nums[j]=nums[j-1];
	            }
	            nums[0]=temp;
	        }
	    }
}

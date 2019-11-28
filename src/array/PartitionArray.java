package array;

public class PartitionArray {
    public static int partitionDisjoint(int [] nums){
        int len=nums.length;
        int result=len;
        int [] left = new int[len];
        int [] right = new int[len];
        int leftMax=-999999999;
        int rightMin=999999999;
        for (int i=0;i<len;i++){
            if(nums[i]>leftMax)
                leftMax=nums[i];
            left[i]=leftMax;
        }
        for(int i=len-1;i>=0;i--){
            if(nums[i]<rightMin)
                rightMin=nums[i];
            right[i]=rightMin;
            }
        for(int i=0;i<len-1;i++){
            if(left[i]<=right[i+1]){
                result=i+1;
                break;
            }
        }
        return result;
    }
}



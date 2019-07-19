package ¶þ²æÊ÷;
public class SortedArrayToBST {

	public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(0,nums.length-1,nums);
        
    }
    public static TreeNode buildTree(int start,int end,int[] nums){
        if(start==end) { 
            return new TreeNode(nums[start]);
        }
        if(start>end){
           return null;
        }
        int pos=(end+start)/2;
        TreeNode root=new TreeNode(nums[pos]);
        root.left=buildTree(start,pos-1,nums);
        root.right=buildTree(pos+1,end,nums);
        return root;
        /*if(pos==0){
            root.left=new TreeNode(nums[pos]);
            return ;
        }
        else if(pos==nums.length-1){
            root.right=new TreeNode(nums[pos]);
            return ;
        }
        else{
            root.left=new TreeNode(nums[pos/2]);
            root.right=new TreeNode(nums[(pos+nums.length-1)/2]);
            buildTree(pos/2,nums,root.left);
            buildTree((pos+nums.length-1)/2,nums,root.right);
        }*/
    }
     public static void main(String[] args) {
    	int[] nums= {-10,-3,0,5,9};
    	TreeNode root=sortedArrayToBST(nums);
    }
}

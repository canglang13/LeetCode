package 二叉树;
class Solution01 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	TreeNode root=dfs(preorder,inorder,0,0,inorder.length-1);
        return root;
    }
    public TreeNode dfs(int[] preorder,int[] inorder,int preStart,int inStart,int inEnd){
        
    	if(inStart>inEnd) return null;
    	
        int currentVal=preorder[preStart];
        TreeNode root=new TreeNode(currentVal);
        
        //找出该结点在中根序列的位置
        int pos=0;
        for(int i=inStart;i<=inEnd;i++) {
        	if(inorder[i]==currentVal) {
        		pos=i;
        		break;
        	}
        }
        
        int leftChildLength=pos-inStart;//左子树长度
        
        //递归建树
        root.left=dfs(preorder,inorder,preStart+1,inStart,pos-1);//先根序列右移一位
        root.right=dfs(preorder,inorder,preStart+leftChildLength+1,pos+1,inEnd);//先跟序列右移左子树长度+1位
        return root;
    }
}
public class PreorderInorder {

}

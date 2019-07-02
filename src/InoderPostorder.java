
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(inorder,postorder,postorder.length-1,0,inorder.length-1);
    }
    
    public TreeNode dfs(int[] inorder,int[] postorder,int postEnd,int inStart,int inEnd) {
    	if(inStart>inEnd) return null;
    	
    	//取出值做根
    	int currentVal=postorder[inEnd];
    	TreeNode root=new TreeNode(currentVal);
    	
    	//找根在中序序列中的位置
    	int pos=0;
    	for(int i=inStart;i<=inEnd;i++) {
    		if(currentVal==inorder[i]) {
    			pos=i;
    		}
    	}
    	int rightChildLength=inEnd-pos;//右子树长度
    	
    	//递归建子树
    	root.right=dfs(inorder,postorder,postEnd-1,pos+1,inEnd);//先根序列左移1位是右子树根结点
    	root.left=dfs(inorder,postorder,postEnd-1-rightChildLength,inStart,pos-1);//先根序列左移右子树长度+1位是左子树根结点
    	return root;
    }
}


public class InoderPostorder {
	
}

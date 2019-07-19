package ������;
class Solution01 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	TreeNode root=dfs(preorder,inorder,0,0,inorder.length-1);
        return root;
    }
    public TreeNode dfs(int[] preorder,int[] inorder,int preStart,int inStart,int inEnd){
        
    	if(inStart>inEnd) return null;
    	
        int currentVal=preorder[preStart];
        TreeNode root=new TreeNode(currentVal);
        
        //�ҳ��ý�����и����е�λ��
        int pos=0;
        for(int i=inStart;i<=inEnd;i++) {
        	if(inorder[i]==currentVal) {
        		pos=i;
        		break;
        	}
        }
        
        int leftChildLength=pos-inStart;//����������
        
        //�ݹ齨��
        root.left=dfs(preorder,inorder,preStart+1,inStart,pos-1);//�ȸ���������һλ
        root.right=dfs(preorder,inorder,preStart+leftChildLength+1,pos+1,inEnd);//�ȸ�������������������+1λ
        return root;
    }
}
public class PreorderInorder {

}

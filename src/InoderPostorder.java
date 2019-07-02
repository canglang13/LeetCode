
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(inorder,postorder,postorder.length-1,0,inorder.length-1);
    }
    
    public TreeNode dfs(int[] inorder,int[] postorder,int postEnd,int inStart,int inEnd) {
    	if(inStart>inEnd) return null;
    	
    	//ȡ��ֵ����
    	int currentVal=postorder[inEnd];
    	TreeNode root=new TreeNode(currentVal);
    	
    	//�Ҹ������������е�λ��
    	int pos=0;
    	for(int i=inStart;i<=inEnd;i++) {
    		if(currentVal==inorder[i]) {
    			pos=i;
    		}
    	}
    	int rightChildLength=inEnd-pos;//����������
    	
    	//�ݹ齨����
    	root.right=dfs(inorder,postorder,postEnd-1,pos+1,inEnd);//�ȸ���������1λ�������������
    	root.left=dfs(inorder,postorder,postEnd-1-rightChildLength,inStart,pos-1);//�ȸ�������������������+1λ�������������
    	return root;
    }
}


public class InoderPostorder {
	
}

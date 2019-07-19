package ¶þ²æÊ÷;
import java.util.*;

public class Inorder {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
    	LinkedList<TreeNode> stack=new LinkedList<TreeNode>();
    	//stack.push(root);
    	TreeNode temp=root;
    	while(temp!=null||!stack.isEmpty()) {
            if(temp!=null){
                stack.push(temp);
                while(temp.left!=null) {
    			    temp=temp.left;
    			    stack.push(temp);
    		    }
            }
    		temp=stack.pop();
    		result.add(temp.val);
    		temp=temp.right;
    	}
    	
    	return result;
    }
}

package ¶þ²æÊ÷;
import java.util.LinkedList;

public class RecoverFromPreorder {
	public TreeNode recoverFromPreorder(String S) {
		if(S.length()==1) {
			return new TreeNode(Integer.parseInt(S));
		}
		String[] vals=S.split("-+");
		String[] depths=S.split("[0-9]+");
		int[] val=new int[vals.length];
		int[] depth=new int[depths.length];
		System.out.println(depths.length);
		LinkedList<TreeNode> v=new LinkedList<TreeNode>();
		LinkedList<Integer> d=new LinkedList<Integer>();
        for(int i=0;i<vals.length;i++) {
        	val[i]=Integer.parseInt(vals[i]);
        	depth[i]=depths[i].length();
        }
        /*for(int i=0;i<val.length;i++) {
        	System.out.println(val[i]);
        	System.out.println(depth[i]);
        }*/
        TreeNode root=new TreeNode(val[0]);
        TreeNode temp=root;
        int tempDepth=0;
        
        for(int i=1;i<=val.length-1;i++) {
        	System.out.println(i);
        	if(tempDepth+1==depth[i]) {
        		if(temp.left==null) {
        			temp.left=new TreeNode(val[i]);
        			v.push(temp);d.push(tempDepth);
            		temp=temp.left;tempDepth++;
        		}else if(temp.right==null) {
        			temp.right=new TreeNode(val[i]);
        			v.push(temp);d.push(tempDepth);
            		temp=temp.right;tempDepth++;
        		}
        		
        	}
        	else {
        		if(!v.isEmpty()) {
        		temp=v.pop();tempDepth=d.pop();
        		i--;
        		}
        	}
        	
        }
        
        
        
        return root;
    }
	public static void main(String[] args) {
		new RecoverFromPreorder().recoverFromPreorder("3");
		
	}
}

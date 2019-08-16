package Á´±í;

public class AddTowNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode p1=l1;
    	ListNode p2=l2;
    	int len1=0,len2=0;
    	while(p1!=null) {
    		p1=p1.next;
    		len1++;
    	}
    	while(p2!=null) {
    		p2=p2.next;
    		len2++;
    	}
    	ListNode t1;
    	ListNode t2;
    	if(len1>=len2) {
    		t1=l1;t2=l2;
    	}
    	else {
    		t1=l2;t2=l1;
    	}
    	ListNode result=t1;
    	while(t2!=null) {
    		int temp=t1.val+t2.val;
    		if(temp>=10) {
    			temp=temp%10;
    			if(t1.next==null) {
    				t1.next=new ListNode(0);	
    			}
    			t1.next.val+=1;
    		}
    		t1.val=temp;
    		t1=t1.next;
    		t2=t2.next;
    	}
    	while(t1!=null) {
    		if(t1.val>=10) {
	    		t1.val=t1.val%10;
	    		if(t1.next==null) {
	    			t1.next=new ListNode(0);
	    		}
	    		t1.next.val+=1;
    		}
    		t1=t1.next;
    	}
		return result;
    }
}

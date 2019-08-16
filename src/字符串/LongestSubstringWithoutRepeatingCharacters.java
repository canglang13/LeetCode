package �ַ���;

/**
 *Given a string, 
 *find the length of the longest substring without repeating characters.
 *
 * @author�� charles
 * @date�� 2019-08-16 11:05
 */
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
	       int len=s.length();
	       String subStr="";//�Ӵ�
	       int result=0,start=0,end=0;
	       int[] a=new int[256];//ά���Ӵ��г��ֵ��ַ���λ��
	       Arrays.fill(a,-1);
	       while(end<len) {
	    	   char ch=s.charAt(end);
	    	   if(a[ch]!=-1) {//���Ӵ��д��ڣ������Ƶ���λ��+1������
	    		   for(int i=start;i<a[ch];i++) {//���ַ��Ƴ�����
	    			   a[s.charAt(i)]=-1;
	    		   }
	    		   start=a[ch]+1;//����
	    		   subStr=s.substring(start, end+1);//���´���
	    		   a[ch]=end;
	    		   end++;
	    		   continue;
	    	   }
	    	   a[ch]=end;
	    	   subStr=subStr+ch;
	    	   result=subStr.length()>result?subStr.length():result;//ά�����ֵ
	    	   end++;
	       }
	       return result;
	}	
	public static void main(String[] args) {
		int a=LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
 	   	System.out.print(a);

	}
}

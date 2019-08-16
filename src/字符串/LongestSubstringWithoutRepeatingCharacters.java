package 字符串;

/**
 *Given a string, 
 *find the length of the longest substring without repeating characters.
 *
 * @author： charles
 * @date： 2019-08-16 11:05
 */
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
	       int len=s.length();
	       String subStr="";//子串
	       int result=0,start=0,end=0;
	       int[] a=new int[256];//维护子串中出现的字符和位置
	       Arrays.fill(a,-1);
	       while(end<len) {
	    	   char ch=s.charAt(end);
	    	   if(a[ch]!=-1) {//若子串中存在，窗口移到该位置+1，继续
	    		   for(int i=start;i<a[ch];i++) {//将字符移出窗口
	    			   a[s.charAt(i)]=-1;
	    		   }
	    		   start=a[ch]+1;//更新
	    		   subStr=s.substring(start, end+1);//更新窗口
	    		   a[ch]=end;
	    		   end++;
	    		   continue;
	    	   }
	    	   a[ch]=end;
	    	   subStr=subStr+ch;
	    	   result=subStr.length()>result?subStr.length():result;//维护最大值
	    	   end++;
	       }
	       return result;
	}	
	public static void main(String[] args) {
		int a=LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
 	   	System.out.print(a);

	}
}

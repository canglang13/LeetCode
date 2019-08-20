package DP;

import java.util.Arrays;

/**
 * 
 *
 * @author£º charles
 * @date£º 2019-08-20 15:49
 */
public class LongestPalindromicSubstring {
	 public static String longestPalindrome(String s) {
		 int start=0,end=0;
		 int len=s.length();
		 Boolean[][] dp=new Boolean[len][len];
		 for(int i=0;i<len;i++) {
		 Arrays.fill(dp[i], false);
		 }
		 for(int i=0;i<len-1;i++) {
			 dp[i][i]=true; 
			 dp[i][i+1]=s.charAt(i)==s.charAt(i+1)?true:false;
			 if(dp[i][i+1]) {
				 start=i;end=i+1;
			 }
		 }
		 dp[len-1][len-1]=true;
		 for(int i=2;i<=len;i++) {
			 for(int j=0;j<len-i;j++) {
				 dp[j][j+i]=dp[j+1][j+i-1]&&s.charAt(j)==s.charAt(j+i);
				 if(dp[j][j+i]) {
					 start=j;end=j+i;
				 }
			 }
		 }
		 return s.substring(start,end+1);
	 }
	 public static void main(String[] args) {
		 System.out.println(longestPalindrome("cbbdbcbbcbd"));
	 }
}

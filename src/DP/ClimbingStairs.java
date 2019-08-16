package DP;
/**
 * 
 *
 * @author£º charles
 * @date£º 2019-08-17 00:35
 */
public class ClimbingStairs {
	 public static int climbStairs(int n) {
		 if(n==1) return 1;
		 if(n==2) return 2;
		 int r1=1,r2=2,result=0;
		 for(int i=3;i<=n;i++) {
			 result=r1+r2;
	         r1=r2;
	         r2=result;
		 }
		 return result;
	 }
}

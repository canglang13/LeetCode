package DP;

import java.util.Arrays;

/**
 * finish(i,j)=finish(i-1,j)+finish(i,j-1);
 * 
 * @author£º charles
 * @date£º 2019-08-21 15:54
 */

/*
public static int uniquePaths(int m, int n) {
	int[][] finish=new int[m][n];
	Arrays.fill(finish[0], 1);
	for(int i=0;i<m;i++) {
		finish[i][0]=1;
	}
	for(int i=1;i<m;i++) {
		for(int j=1;j<n;j++) {
			finish[i][j]=finish[i-1][j]+finish[i][j-1];
		}
	}
	return  finish[m-1][n-1];
}
*/


/**
 * 
 * O(n)¿Õ¼äÓÅ»¯
 *
 * @author£º charles
 * @date£º 2019-08-21 16:52
 */
public class UniquePaths {
	public static int uniquePaths(int m, int n) {
		int[] finish=new int[n];
		Arrays.fill(finish, 1);
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				finish[j]=finish[j-1]+finish[j];
			}
		}
		return  finish[n-1];
	}

	public static void main(String[] args) {
		System.out.println(uniquePaths(1,2));
	}
}

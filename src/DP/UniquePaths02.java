package DP;
/**
 *finish(i,j)=finish(i-1,j)+finish(i,j-1);
 *
 *if(obstacleGrid[i][j]==1) finish(i,j)=0
 *
 * @author£º charles
 * @date£º 2019-08-21 17:09
 */
public class UniquePaths02 {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m=obstacleGrid.length;
		int n=obstacleGrid[0].length;
		int[] finish=new int[n];
		int temp=1;
		for(int i=0;i<n;i++) {
			if(obstacleGrid[0][i]==1) 
				temp=0;
			finish[i]=temp;
		}
		for(int i=1;i<m;i++) {
			if(obstacleGrid[i][0]==1)
				finish[0]=0;
			for(int j=1;j<n;j++) {
				if(obstacleGrid[i][j]==1)
					finish[j]=0;
				else
					finish[j]=finish[j-1]+finish[j];
			}
		}
		return  finish[n-1];
	}
		public static void main(String[] args) {
			int a[][]= {{0},{1}};
			System.out.println(uniquePathsWithObstacles(a));
		}
}

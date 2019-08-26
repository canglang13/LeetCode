package DP;

/**
 * 
 *
 * @author£º charles
 * @date£º 2019-08-21 17:48
 */
/*public class MinimumPathSum {
	public static int minPathSum(int[][] grid) {
		int m=grid.length;
		int n=grid[0].length;
        int[][] finish=new int[m][n];
        finish[0][0]=grid[0][0];
        for(int i=1;i<n;i++)
        	finish[0][i]=grid[0][i]+finish[0][i-1];
        for(int i=1;i<m;i++)
        	finish[i][0]=grid[i][0]+finish[i-1][0];
        for(int i=1;i<m;i++) {
        	for(int j=1;j<n;j++) {
        		finish[i][j]=grid[i][j]+(finish[i-1][j]<finish[i][j-1]?finish[i-1][j]:finish[i][j-1]);
        		
        	}
        }
        /*for(int i=0;i<m;i++)
        	for(int j=0;j<n;j++) 
        		System.out.print(finish[i][j]+" ");
        System.out.println("");
        return finish[m-1][n-1];
    }*/
	
	public class MinimumPathSum {
		public static int minPathSum(int[][] grid) {
			int m=grid.length;
			int n=grid[0].length;
	        int[] finish=new int[n];
	        finish[0]=grid[0][0];
	        for(int i=1;i<n;i++)
	        	finish[i]=grid[0][i]+finish[i-1];
	        for(int i=1;i<m;i++) {
	        	finish[0]+=grid[i][0];
	        	for(int j=1;j<n;j++) {
	        		finish[j]=grid[i][j]+(finish[j]<finish[j-1]?finish[j]:finish[j-1]);
	        		
	        	}
	        }
	        /*for(int i=0;i<m;i++)
	        	for(int j=0;j<n;j++) 
	        		System.out.print(finish[i][j]+" ");
	        System.out.println("");*/
	        return finish[n-1];
	    }
	public static void main(String[] args) {
		int[][] a={{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(a));
	}
}

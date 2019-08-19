import java.util.*;

public class Main {
	static int time=0;
	static int u;
	static int d;
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()) {
			time=0;
			int n=scan.nextInt();
			if(n==0) {break;}
			u=scan.nextInt();
			d=scan.nextInt();
			dfs(n);
			System.out.println(time);
		}
	}
	public static void dfs(int n) {
		if(n<=u) {
			time++;
			return;
		}
		else {
			time+=2;
			n-=(u-d);
			dfs(n);
		}
	}
}

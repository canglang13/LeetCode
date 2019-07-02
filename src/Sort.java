
public class Sort {
	public static void qsort(int[] num,int low,int high) {
		int i=low;
		int j=high;
		if(low>high) {
			return;
		}
		int temp=num[low];
		while(i<j) {
			while(num[j]>=temp&&i<j) {
				j--;
			}
			while(num[i]<=temp&&i<j) {
				i++;
			}
			if(i<j) {
				int t=num[i];
				num[i]=num[j];
				num[j]=t;
			}
		}
		num[low]=num[i];
		num[i]=temp;
		qsort(num,low,i-1);
		qsort(num,i+1,high);
		//return ;
	}
	public static void main(String args[]) {
		int[] a={6,2,5,8,4,6,3,6,9,12,4,5,7,23,34,12,14,7,89,12,44};
		qsort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

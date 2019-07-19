package ¶ş·Ö·¨;
/** 

* @author Àµ³¿ÀÊ 

*/
public class GuessNumber {
	public static int guessNumber(int n) {
        int mid=n/2;
        int start=1;
        int end=n;
        while (start<=end){
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==-1){
                end=mid-1;
                mid=(start+end)/2;
                continue;
            }
            else if(guess(mid)==1){
                start=mid+1;
                mid=(start+end)/2;
                continue;
            }
        }
        return start;
    }
	public static int guess(int i) {
		if(i==6) {
			return 0;
		}
		else if(i>6) {
			return -1;
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(guessNumber(10));
	}
}


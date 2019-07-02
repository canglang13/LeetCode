import java.util.HashMap;
import java.util.Scanner;

public class StringMatch {
	public static boolean match(String str,String pattern) {
		String parts[]=str.split(" ");
		HashMap<Character,String> map=new HashMap<Character,String>();
		for(int i=0;i<pattern.length();i++) {
			if(map.containsKey(pattern.charAt(i))) {
				if(!map.get(pattern.charAt(i)).equals(parts[i])) {
					return false;
				}
			}
			else {
				map.put(pattern.charAt(i), parts[i]);
			}
		}
		return true;
	}
	public static void main(String args[]) {
		String str="北京 杭州 杭州 广州";
		Scanner scan=new Scanner(System.in);
		String p=scan.nextLine();
		System.out.println(match(str,p));
	}
}

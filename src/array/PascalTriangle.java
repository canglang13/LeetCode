package array;
/**
 * Given a non-negative integer numRows, generate the first
 *  numRows of Pascal's triangle.
 * 
 * @author： charles
 * @date： 2019-08-15 12:04
 */
import java.util.*;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> t=new ArrayList<Integer>(i);
            t.add(1);
            if(i>0) {
	            for(int j=1;j<i;j++){//j作为新数组的下标
	               t.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
	            }
	            t.add(1);
            }
            result.add(t);
        }
        return result;
    }
	public static void display(List<List<Integer>> t) {
		System.out.print("[");
		for(int i=0;i<t.size();i++) {
			System.out.print("[");
			for(int j=0;j<t.get(i).size();j++) {
				System.out.print(t.get(i).get(j));
			}			
			System.out.print("]");
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		List<List<Integer>> a=generate(5);
		display(a);
	}
}

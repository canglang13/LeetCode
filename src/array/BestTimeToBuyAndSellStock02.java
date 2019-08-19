package array;
/**
 * Greedy£¨Ì°ÐÄËã·¨£©
 *
 * @author£º charles
 * @date£º 2019-08-18 11:57
 */
public class BestTimeToBuyAndSellStock02 {
	public int maxProfit(int[] prices) {
		if(prices.length==0) return 0;
	    int result=0,min=prices[0],temp=prices[0];
	    for(int i=0;i<prices.length-1;i++) {
	    	if(temp>=prices[i+1]) {
	    		result+=prices[i]-min;
	    		min=prices[i+1];
	    	}
            temp=prices[i+1];
	    }
	    result+=prices[prices.length-1]-min;
	    return result;
	}
}

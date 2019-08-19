package DP;
/**
 * res[i+1]=max(res[i],prices[i]-min);
 * 100% 100%
 * @author£º charles
 * @date£º 2019-08-18 11:36
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int min=prices[0],result=0;
        for (int i=0;i<prices.length;i++) {
        	min=min<prices[i]?min:prices[i];
        	result=result>prices[i]-min?result:prices[i]-min;
        }
        return result;
    }
}
	
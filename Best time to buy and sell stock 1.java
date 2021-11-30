import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            int curr = 0;
            min = Math.min(prices[i],min);
            curr = prices[i]-min;
            profit = Math.max(profit,curr);
        }
        return profit;
    }
}

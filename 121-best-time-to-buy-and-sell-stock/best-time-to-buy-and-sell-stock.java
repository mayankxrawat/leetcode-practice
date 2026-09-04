class Solution {
    public int maxProfit(int[] prices) {
     int maxprofit =0;
     int n= prices.length;
     int buyprice = prices[0];
     for(int i = 1; i< n;i++){
        int profit = prices[i] - buyprice ;
        maxprofit = Math.max(maxprofit , profit);
        buyprice = Math.min(buyprice , prices[i]);
     }
     return maxprofit;
    }
}
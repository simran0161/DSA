class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;

        for(int i:prices){
            if(i<buy){
                buy=i;
            }
            else{
                profit=Math.max(profit,i-buy);
            }
        }
        return profit;
    }
}
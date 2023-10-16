// LEETCODE PROBLEM - 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=10001;
        for(int price:prices)
        {
            buy=Math.min(buy,price);
            profit=Math.max(profit,price-buy);
        }
        return profit;
    }
}
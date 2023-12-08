// LEETCODE PROBLEM - 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0],maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else if(maxProfit<prices[i]-minPrice)
            {
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}

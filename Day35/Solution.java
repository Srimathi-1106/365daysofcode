//LEETCODE PROBLEM - 2706. Buy Two Chocolates
 
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int s=prices[0]+prices[1];
        if(s<=money)
            return money-s;
        for(int i=0;i<prices.length-2;i++)
        {
            s=s-prices[i]+prices[i+2];
            if(s<=money)
                return money-s;
        }
        return money;
    }
}
// LEETCODE PROBLEM - 2806. Account Balance After Rounded Purchase

class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if(p%10>=5)
        {
            return Math.abs(100-(p-(p%10)+10));
        }
        else
        {
            return Math.abs(100-(p-(p%10)));
        }
    }
}
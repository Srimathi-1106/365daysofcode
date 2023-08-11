//LEETCODE PROBLEM - 518. Coin Change II

class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int ways[][]=new int[n+1][amount+1];
        for(int i=0;i<n;i++)
        {
            ways[i][0]=1;
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=amount;j++)
            {
                if(coins[i]>j)
                {
                    ways[i][j]=ways[i+1][j];
                }
                else
                {
                    ways[i][j]=ways[i+1][j]+ways[i][j-coins[i]];
                }
            }
        }
        return ways[0][amount];
    }
}
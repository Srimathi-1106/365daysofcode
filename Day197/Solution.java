// LEETCODE PROBLEM - 279. Perfect Squares

class Solution {
    public static int recursion(int n,int dp[])
    {
        if(n<4)
        return n;
        if(dp[n]!=0)
        return dp[n];
        int min=n,square;
        for(int i=1;i*i<=n;i++)
        {
            square=i*i;
            min=Math.min(min,n/square+recursion(n%square,dp));
        }
        dp[n]=min;
        return min;
    }
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        return recursion(n,dp);
    }
}
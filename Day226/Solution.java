// LEETCODE PROBLEM - 96. Unique Binary Search Trees

class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;
        for(int node=2;node<=n;node++)
        {
            for(int i=0;i<node;i++)
            {
                dp[node]+=dp[i]*dp[node-(i+1)];
            }
        }
        return dp[n];
    }
}

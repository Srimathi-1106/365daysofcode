// LEETCODE PROBLEM - 1143. Longest Common Subsequence

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int i=1,j=1;
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        char t1[]=text1.toCharArray();
        char t2[]=text2.toCharArray();
        for(char char1:t1)
        {
            j=1;
            for(char char2:t2)
            {
                if(char1==char2)
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(Math.max(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1]);
                }
                j++;
            }
            i++;
        }
        return dp[i-1][j-1];
    }
}
// LEETCODE PROBLEM - 91. Decode Ways

class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        return ways(s,0,dp);
    }
    static int ways(String s,int i,int dp[])
    {
        if(i==s.length())
        return 1;
        if(dp[i]!=-1)
        return dp[i];
        int sum=0;
        if(s.charAt(i)!='0')
        {
            int a=s.charAt(i)-'0';
            if(a>0 && a<27)
            {
                sum+=ways(s,i+1,dp);
            }
            if(i+1<s.length())
            {
                a=a*10+s.charAt(i+1)-'0';
                if(a<=26)
                {
                    sum+=ways(s,i+2,dp);
                }
            }
        }
        return dp[i]=sum;
    }
}
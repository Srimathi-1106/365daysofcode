// LEETCODE PROBLEM - 1615. Maximal Network Rank

class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        short c[]=new short[n];
        byte route[][]=new byte[n][n];
        for(int[] road:roads)
        {
            c[road[0]]++;
            c[road[1]]++;
            route[road[0]][road[1]]=1;
            route[road[1]][road[0]]=1;
        }
        int m=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(m<c[i]+c[j]-route[i][j])
                m=c[i]+c[j]-route[i][j];
            }
        }
        return m;
    }
}
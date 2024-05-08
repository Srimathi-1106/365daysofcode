// LEETCODE PROBLEM - 506. Relative Ranks

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max=0,rank=1;
        for(int sc:score)
        max=Math.max(max,sc);
        int maxScore[]=new int[max+1];
        for(int i=0;i<score.length;i++)
        {
            maxScore[score[i]]=i+1;
        }
        String metals[]={"Gold Medal","Silver Medal","Bronze Medal"};
        String result[]=new String[score.length];
        for(int i=max;i>=0;i--)
        {
            if(maxScore[i]!=0)
            {
                if(rank<4)
                {
                    result[maxScore[i]-1]=metals[rank-1];
                }
                else
                {
                    result[maxScore[i]-1]=rank+"";
                }
                rank++;
            }
        }
        return result;
    }
}
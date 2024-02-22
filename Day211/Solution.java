// LEETCODE PROBLEM - 997. Find the Town Judge

class Solution {
    public int findJudge(int n, int[][] trusts) {
        int frequencyOfTrust[]=new int[n+1];
        for(int[] trust:trusts)
        {
            frequencyOfTrust[trust[0]]=-1;
            if(frequencyOfTrust[trust[1]]==-1)
            continue;
            frequencyOfTrust[trust[1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(frequencyOfTrust[i]==n-1)
            return i;
        }
        return -1;
    }
}
// LEETCODE PROBLEM - 2225. Find Players With Zero or One Losses

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int fre[]=new int[100001];
        for(int i=0;i<matches.length;i++)
        {
            if(fre[matches[i][0]]==0)
            {
                fre[matches[i][0]]=-1;
            }
            if(fre[matches[i][1]]==-1)
            {
                fre[matches[i][1]]=1;
            }
            else
            {
                fre[matches[i][1]]++;
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> notLost=new ArrayList<>();
        List<Integer> oneLost=new ArrayList<>();
        for(int i=0;i<100001;i++)
        {
            if(fre[i]==-1)
            {
                notLost.add(i);
            }
            else if(fre[i]==1)
            {
                oneLost.add(i);
            }
        }
        result.add(notLost);
        result.add(oneLost);
        return result;
    }
}
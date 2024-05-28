// LEETCODE PROBLEM - 1208. Get Equal Substrings Within Budget

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char s_arr[]=s.toCharArray();
        char t_arr[]=t.toCharArray();
        int costs[]=new int[s.length()];
        int maxLen=0,cost=maxCost;
        int arrlen=s.length();
        for(int i=0;i<arrlen;i++)
        {
            costs[i]=Math.abs(s_arr[i]-t_arr[i]);
        }
        int l=0,r=0;
        while(l<arrlen && r<arrlen && l<=r)
        {
            if(costs[r]<=maxCost)
            {
                if(costs[r]<=cost)
                {
                    cost-=costs[r];
                    r++;
                }
                else
                {
                    cost+=costs[l];
                    l++;
                }
            }
            else
            {
                cost=maxCost;
                r++;
                l=r;
            }
            if(maxLen<r-l)
            maxLen=r-l;
        }
        return maxLen;
    }
}
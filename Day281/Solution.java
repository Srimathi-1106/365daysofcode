// LEETCODE PROBLEM - 2441. Largest Positive Integer That Exists With Its Negative

class Solution {
    public int findMaxK(int[] nums) {
        int fre[]=new int[1001];
        int large=-1;
        for(int num:nums)
        {
            if(num>=1)
            {
                if(fre[num]==-1)
                {
                    large=Math.max(large,num);
                }
                else
                {
                    fre[num]=1;
                }
            }
            else
            {
                if(fre[num*-1]==1)
                {
                    large=Math.max(large,num*-1);
                }
                else
                {
                    fre[num*-1]=-1;
                }
            }
        }
        return large;
    }
}
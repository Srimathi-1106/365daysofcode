// LEETCODE PROBLEM - 41. First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        int l=nums.length;
        boolean fre[]=new boolean[l+1];
        for(int n:nums)
        {
            if(n>=1 && n<=l)
            {
                fre[n]=true;
            }
        }
        for(int i=1;i<=l;i++)
        {
            if(!fre[i])
            return i;
        }
        return l+1;
    }
}
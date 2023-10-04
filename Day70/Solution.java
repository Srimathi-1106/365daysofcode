// LEETCODE PROBLEM - 2784. Check if Array is Good

class Solution {
    public boolean isGood(int[] nums) {
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(m<nums[i])
            m=nums[i];
        }
        byte a[]=new byte[m+1];
        if(m+1!=nums.length)
            return false;
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        a[m]--;
        for(int i=1;i<=m;i++)
        {
            if(a[i]==0)
            return false;
        }
        return true;
    }
}
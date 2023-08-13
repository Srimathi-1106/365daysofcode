//LEETCODE PROBLEM - 2369. Check if There is a Valid Partition For The Array

class Solution {
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        boolean b[]=new boolean[n+1];
        b[0]=true;
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            if(i>0 && nums[i]==nums[i-1])
            b[j]|=b[j-2];
            if(i>1 && nums[i]==nums[i-1] && nums[i]==nums[i-2])
            b[j]|=b[j-3];
            if(i>1 && nums[i]==nums[i-1]+1 && nums[i]==nums[i-2]+2)
            b[j]|=b[j-3];
        }
        return b[n];
    }
}
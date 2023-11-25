// LEETCODE PROBLEM - 1685. Sum of Absolute Differences in a Sorted Array

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int l=nums.length;
        int res[]=new int[l];
        int total=0;
        for(int i=0;i<l;i++)
        {
            total+=nums[i];
        }
        int currentsum=0;
        for(int i=0;i<l;i++)
        {
            currentsum+=nums[i];
            res[i]=(nums[i]*i)-(currentsum-nums[i])+(total-currentsum)-(nums[i]*(l-1-i));
        }
        return res;
    }
}
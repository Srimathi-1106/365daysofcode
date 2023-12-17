// LEETCODE PROBLEM - 162. Find Peak Element

class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==2)
        {
            return nums[0]>nums[1]?0:1;
        }
        for(int i=1;i<n-1;i++)
        {
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1])
            return i;
        }
        if(n>2 && nums[n-1]>nums[n-2])
        return n-1;
        return 0;
    }
}
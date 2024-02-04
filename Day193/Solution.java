// LEETCODE PROBLEM - 1752. Check if Array Is Sorted and Rotated

class Solution {
    public boolean check(int[] nums) {
        boolean flag=false;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]>nums[i])
            {
                if(flag || nums[0]<nums[n-1])
                return false;
                flag=true;
            }
        }
        return true;
    }
}
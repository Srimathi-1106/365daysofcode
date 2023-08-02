//LEETCODE PROBLEM - 153. Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        for(int i=1;i<=nums.length-1;i++)
        {
            if(nums[i-1]>nums[i])
            return nums[i];
        }
        return nums[0];
    }
}
//LEETCODE PROBLEM- 154. Find Minimum in Rotated Sorted Array II

class Solution {
    public int findMin(int[] nums) {
        for(short i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                return nums[i];
            }
        }
        return nums[0];    
    }
}
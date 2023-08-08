//LEETCODE PROBLEM- 33. Search in Rotated Sorted Array

class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}
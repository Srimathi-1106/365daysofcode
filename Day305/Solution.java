// LEETCODE PROBLEM - 80. Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        int l=1,count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count<=1)
            {
                nums[l]=nums[i];
                l++;
            }
        }
        return l;
    }
}
// LEETCODE PROBLEM - 283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                nums[i++]=num;
            }
        }
        for(;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}
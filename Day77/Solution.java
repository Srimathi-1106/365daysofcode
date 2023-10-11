// LEETCODE PROBLEM - 137. Single Number II

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            i=i+2;
            else
            return nums[i];
        }
        return nums[nums.length-1];
    }
}
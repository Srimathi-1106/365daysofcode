// LEETCODE PROBLEM - 2733. Neither Minimum nor Maximum

class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            min=nums[i];
            if(max<nums[i])
            max=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=min && nums[i]!=max)
            return nums[i];
        }
        return -1;
    }
}
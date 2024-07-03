// LEETCODE PROBLEM - 1509. Minimum Difference Between Largest and Smallest Value in Three Moves

class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4)
        return 0;
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<4;i++)
        {
            if(nums[nums.length-1-3+i]-nums[i]<min)
            min=nums[nums.length-1-3+i]-nums[i];
        }
        return min;
    }
}
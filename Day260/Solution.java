// LEETCODE PROBLEM - 3105. Longest Strictly Increasing or Strictly Decreasing Subarray

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max_length=1,increasing_count=1,decreasing_count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                increasing_count++;
                decreasing_count=1;
            }
            else if(nums[i-1]>nums[i])
            {
                decreasing_count++;
                increasing_count=1;
            }
            else
            {
                increasing_count=1;
                decreasing_count=1;
            }
            max_length=Math.max(max_length,Math.max(increasing_count,decreasing_count));
        }
        return max_length;
    }
}
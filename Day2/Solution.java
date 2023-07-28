//LEETCODE PROBLEM- 53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(nums[0]<sum)
            nums[0]=sum;
            if(sum<0)
            sum=0;
        }
        return nums[0];
    }
}
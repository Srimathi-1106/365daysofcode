// LEETCODE PROBLEM - 198. House Robber

class Solution {
    public static int rec(int nums[], int index,int memo[]) {
        if (index >= nums.length)
            return 0;
        if(memo[index]!=-1)
            return memo[index];
        int taken = nums[index] + rec(nums, index + 2,memo),
        notTaken = rec(nums, index + 1,memo);
        memo[index]=Math.max(taken,notTaken);
        return memo[index];
    }

    public int rob(int[] nums) {
        int memo[]=new int[nums.length];
        Arrays.fill(memo,-1);
        return rec(nums, 0,memo);
    }
}
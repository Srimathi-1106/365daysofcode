// LEETCODE PROBLEM - 45. Jump Game II

class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int currEnd=0,currFarthest=0,jumps=0;
        for(int i=0;i<n-1;i++)
        {
            currFarthest=Math.max(i+nums[i],currFarthest);
            if(i==currEnd)
            {
                jumps++;
                currEnd=currFarthest;
            }
        }
        return jumps;
    }
}
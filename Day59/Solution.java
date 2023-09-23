// LEETCODE PROBLEM - 2656. Maximum Sum With Exactly K Elements

class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i])
            max=nums[i];
        }
        int sum=max;
        for(int i=1;i<k;i++)
        {
            sum+=max+i;   
        }
        return sum;
    }
}
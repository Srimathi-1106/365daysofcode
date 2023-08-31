// LEETCODE PROBLEM - 268. Missing Number

class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            s+=i;
            s-=nums[i];
        }
        return s+i;
    }
}
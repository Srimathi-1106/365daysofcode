// LEETCODE PROBLEM - 1877. Minimize Maximum Pair Sum in Array

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=nums[0]+nums[n-1];
        for(int i=1;i<n/2;i++)
        {
            if(m<nums[i]+nums[n-i-1])
            m=nums[i]+nums[n-i-1];
        }
        return m;
    }
}
// LEETCODE PROBLEM - 3010. Divide an Array Into Subarrays With Minimum Cost I

class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0],min1=Integer.MAX_VALUE,min2=min1;
        for(int i=1;i<nums.length;i++)
        {
            if(min2>nums[i])
            {
                if(min1>nums[i])
                {
                    min2=min1;
                    min1=nums[i];
                }
                else
                {
                    min2=nums[i];
                }
            }
        }
        return sum+min1+min2;
    }
}
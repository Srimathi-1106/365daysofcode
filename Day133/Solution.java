// LEETCODE PROBLEM - 2932. Maximum Strong Pair XOR I

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        for(int i=nums.length-1;i>0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[j],nums[i]))
                {
                    if((nums[j]^nums[i])>max)
                    {
                        max=(nums[j]^nums[i]);
                    }
                }
            }
        }
        return max;
    }
}
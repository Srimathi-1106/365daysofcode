// LEETCODE PROBLEM - 2908. Minimum Sum of Mountain Triplets I

class Solution {
    public int minimumSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]<nums[j] && nums[j]>nums[k])
                    {
                    c=nums[i]+nums[j]+nums[k];
                    if(min>c)
                        min=c;
                    }
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
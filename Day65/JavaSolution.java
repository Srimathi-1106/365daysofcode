// LEETCODE PROBLEM - 896. Monotonic Array

class Solution {
    public boolean isMonotonic(int[] nums) {
        int c=0;
        if(nums[0]<nums[nums.length-1])
        {
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]<=nums[i+1])
                    c++;
                else 
                    return false;
            }
        }
        else
        {
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]>=nums[i+1])
                    c++;
                else
                    return false;
            }
        }
        if(c==nums.length-1)
        return true;
        return false;
    }
}
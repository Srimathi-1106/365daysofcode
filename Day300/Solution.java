// LEETCODE PROBLEM - 3151. Special Array I

class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums[0]%2==0)
        {
            for(int i=1;i<nums.length;i++)
            {
                if(i%2==1 && nums[i]%2!=1)
                {
                    return false;
                }
                else if(i%2==0 && nums[i]%2!=0)
                {
                    return false;
                }
            }
        }
        else
        {
            for(int i=1;i<nums.length;i++)
            {
                if(i%2==1 && nums[i]%2!=0)
                {
                    return false;
                }
                else if(i%2==0 && nums[i]%2!=1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
// LEETCODE PROBLEM - 485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxOnes=0;
        for(int num:nums)
        {
            if(num==1)
            {
                count++;
                if(maxOnes<count)
                {
                    maxOnes=count;
                }
            }
            else
            count=0;
        }
        return maxOnes;
    }
}
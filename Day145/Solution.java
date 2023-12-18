// LEETCODE PROBLEM - 1913. Maximum Product Difference Between Two Pairs

class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=max1,min1=Integer.MAX_VALUE,min2=min1;
        for(int num:nums)
        {
            if(min2>num)
            {
                if(min1>num)
                {
                    min2=min1;
                    min1=num;
                }
                else
                {
                    min2=num;
                }
            }
            if(max2<num)
            {
                if(max1<num)
                {
                    max2=max1;
                    max1=num;
                }
                else
                {
                    max2=num;
                }
            }
        }
        return max1*max2-min1*min2;
    }
}
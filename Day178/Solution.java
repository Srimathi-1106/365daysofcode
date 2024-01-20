// LEETCODE PROBLEM - 628. Maximum Product of Three Numbers

class Solution {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=max1,max3=max1,min1=Integer.MAX_VALUE,min2=min1;
        for(int num:nums)
        {
            if(max3<num)
            {
                if(max2<num)
                {
                    if(max1<num)
                    {
                        max3=max2;
                        max2=max1;
                        max1=num;
                    }
                    else 
                    {
                        max3=max2;
                        max2=num;
                    }
                }
                else 
                {
                    max3=num;
                }
            }
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
        }
        return Math.max(max1*max2*max3,max1*min1*min2);
    }
}
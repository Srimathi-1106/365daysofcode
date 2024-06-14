// LEETCODE PROBLEM - 945. Minimum Increment to Make Array Unique

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max=0;
        for(int num:nums)
        {
            if(max<num)
            max=num;
        }
        int fre[]=new int[max+nums.length];
        for(int num:nums)
        {
            fre[num]++;
        }
        int result=0;
        for(int i=0;i<fre.length;i++)
        {
            if(fre[i]>1)
            {
                result+=fre[i]-1;
                fre[i+1]+=fre[i]-1;
            }
        }
        return result;
    }
}
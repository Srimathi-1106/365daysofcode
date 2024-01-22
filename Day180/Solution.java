// LEETCODE PROBLEM - 645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[]=new int[2];
        int fre[]=new int [nums.length+1];
        for(int num:nums)
        {
            fre[num]++;
            if(fre[num]==2)
            result[0]=num;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(fre[i]==0)
            {
                result[1]=i;
                break;
            }
        }
        return result;
    }
}
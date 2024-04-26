// LEETCODE PROBLEM - 2974. Minimum Number Game

class Solution {
    public int[] numberGame(int[] nums) {
        int fre[]=new int[101];
        for(int num:nums)
        {
            fre[num]++;
        }
        int result[]=new int[nums.length];
        int i=1,index=1;
        boolean f=true;
        while(i<101)
        {
            if(fre[i]>=1)
            {
                fre[i]-=1;
                if(f)
                {
                    result[index]=i;
                    f=false;
                    index-=1;
                }
                else
                {
                    result[index]=i;
                    f=true;
                    index+=3;
                }
            }
            if(fre[i]==0)
            i++;
            if(index==nums.length)
            break;
        }
        return result;
    }
}
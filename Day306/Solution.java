// LEETCODE PROBLEM - 1608. Special Array With X Elements Greater Than or Equal X

class Solution {
    public int specialArray(int[] nums) {
        int x=nums.length;
        int counts[]=new int[nums.length+1];
        for(int num:nums)
        {
            if(num>=x)
            counts[x]++;
            else
            counts[num]++;
        }
        int count=0;
        for(int i=x;i>=0;i--)
        {
            count+=counts[i];
            if(count==i)
            return i;
        }
        return -1;
    }
}
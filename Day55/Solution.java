// LEETCODE PROBLEM - 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        byte c[]=new byte[nums.length];
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(c[nums[i]-1]==1)
            break;
            c[nums[i]-1]++;
        }
        return nums[i];
    }
}
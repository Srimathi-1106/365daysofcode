// LEETCODE PROBLEM - 3028. Ant on the Boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0,count=0;
        for(int num:nums)
        {
            sum+=num;
            if(sum==0)
            {
                count++;
            }
        }
        return count;
    }
}
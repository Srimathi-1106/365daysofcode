// LEETCODE PROBLEM - 238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[]=new int[nums.length];
        int preProduct=1;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=preProduct;
            preProduct*=nums[i];
        }
        int postProduct=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=postProduct;
            postProduct*=nums[i];
        }
        return result;
    }
}
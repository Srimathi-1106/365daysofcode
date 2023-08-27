// LEETCODE PROBLEM - 27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0)
        return 0;
        int j=n-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            n--;
        }
        for(int i=0;i<=j;i++)
        {
            if(nums[i]==val && j>=i)
            {
                while(nums[j]==val && j>0)
                {
                    j--;
                }
                nums[i]=nums[j];
                j--;
            }
        }
        return n;
    }
}
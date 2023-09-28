// LEETCODE PROBLEM - 905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=1,t,n=nums.length;
        for(int i=0;i<n;i++,j++)
        {
            if(nums[i]%2==1 && j<n)
            {
                while(j<n-1 && nums[j]%2==1)
                {
                    j++;
                }
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
        return nums;
    }
}
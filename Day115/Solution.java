// LEETCODE PROBLEM - 1838. Frequency of the Most Frequent Element

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFrequency=0;
        long currentSum=0;
        for(int left=0,right=0;right<nums.length;right++)
        {
            currentSum+=nums[right];
            while(currentSum+k<(long)nums[right]*(right-left+1))
            {
                currentSum-=nums[left];
                left++;
            }
            maxFrequency=Math.max(maxFrequency,right-left+1);
        }
        return maxFrequency;
    }
}
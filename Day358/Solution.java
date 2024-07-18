// LEETCODE PROBLEM - 2971. Find Polygon With the Largest Perimeter

class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0,max=-1;
        for(int num:nums)
        {
            if(sum>num)
            {
                if(sum+num>max)
                max=sum+num;
            }
            sum+=num;
        }
        return max;
    }
}
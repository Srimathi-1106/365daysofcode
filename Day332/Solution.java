LEETCODE PROBLEM - 1248. Count Number of Nice Subarrays

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0,count_odd=0,i=0,pre_even=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]%2==1)
            count_odd++;
            if(count_odd==k)
            {
                pre_even=0;
                while(count_odd==k)
                {
                    count_odd-=nums[i]%2;
                    pre_even++;
                    i++;
                }
            }
            count+=pre_even;
        }
        return count;
    }
}


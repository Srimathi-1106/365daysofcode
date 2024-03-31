// LEETCODE PROBELEM - 2958. Length of Longest Subarray With at Most K Frequency

// Array Based Solution 
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int frequency[]=new int[max-min+1];
        int left=0,right=0,maxLength=0;
        while(right<nums.length)
        {
            frequency[nums[right]-min]++;
            while(frequency[nums[right]-min]>k)
            {
                frequency[nums[left]-min]--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
        
    }
}

//HashMap  Based Solution
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0,max=0,c=0;
        while(j<nums.length)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(map.get(nums[j])>k)
            {
                while(nums[i]!=nums[j])
                {
                    map.put(nums[i],map.get(nums[i])-1);
                    i++;
                }
                i++;
                map.put(nums[j],map.get(nums[j])-1);
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}

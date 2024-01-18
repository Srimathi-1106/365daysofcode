// LEETCODE PROBLEM - 560. Subarray Sum Equals K

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> subarraySum=new HashMap<>();
        subarraySum.put(0,1);
        int count=0,prefixSum=0;
        for(int num:nums)
        {
            prefixSum+=num;
            count+=subarraySum.getOrDefault(prefixSum-k,0);
            subarraySum.put(prefixSum,subarraySum.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
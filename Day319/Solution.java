// LEETCODE PROBLEM - 974. Subarray Sums Divisible by K

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int counts[]=new int[k];
        int sum=0;
        for(int n:nums)
        {
            sum+=(n%k+k)%k;
            counts[sum%k]++;
        }
        int result=counts[0];
        for(int c:counts)
        {
            result+=(c*(c-1))/2;
        }
        return result;
    }
}
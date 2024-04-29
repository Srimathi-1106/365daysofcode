// LEETCODE PROBLEM - 2997. Minimum Number of Operations to Make Array XOR Equal to K

class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0,count=0;
        for(int num:nums)
        xor^=num;
        while(k>0 || xor>0)
        {
            if(k%2!=xor%2)
            {
                count++;
            }
            k/=2;
            xor/=2;
        }
        return count;
    }
}
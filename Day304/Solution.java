// LEETCODE PROBLEM - 3158. Find the XOR of Numbers Which Appear Twice

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int fre[]=new int[51];
        int xor=0;
        for(int num:nums)
        {
            fre[num]++;
        }
        for(int i=1;i<51;i++)
        {
            if(fre[i]==2)
            xor^=i;
        }
        return xor;
    }
}
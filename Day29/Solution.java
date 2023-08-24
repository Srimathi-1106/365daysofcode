//LEETCODE PROBLEM - 191. Number of 1 Bits

public class Solution {
    public int hammingWeight(int n) {
        int c=0;
        for(int i=0;i<32;i++)
        {
            if((n&1)==1)
                c++;
            n>>=1;
        }
        return c;
    }
}
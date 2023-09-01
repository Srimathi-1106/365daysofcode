// LEETCODE PROBLEM - 338. Counting Bits

class Solution {
    public int[] countBits(int n) {
        int count[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
           count[i]=count[i/2]+(i%2);
        }
        return count;
    }
}
// LEETCODE PROBLEM - 2614. Prime In Diagonal

class Solution {
    public int diagonalPrime(int[][] nums) {
        int p=0;
        for(int i=0;i<nums.length;i++)
        {
            p=Math.max(p,Math.max(prime(nums[i][i]),prime(nums[i][nums.length-1-i])));
        }
        return p;
    }
    public int prime(int n)
    {
        if(n==0 || n==1)
        return 0;
        if(n==2)
        return 2;
        int c=0;
        for(int j=2;j<=Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                c=1;
                break;
            }
        }
        if(c==0 && n!=1)
        {
            return n;
        }
        return 0;
    }
}
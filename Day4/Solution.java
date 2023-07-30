//LEETCODE PROBLEM- 204. Count Primes

class Solution {
    public int countPrimes(int n) {
        int p[]=new int[n+1];
        for(int i=2;i<n;i++)
        {
            if(p[i]==0)
            {
                p[0]++;
                for(int j=i*2;j<n;j+=i)
                {
                    p[j]=1;
                }
            }
        }
        return p[0];
    }
}
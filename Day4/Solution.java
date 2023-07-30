//LEETCODE PROBLEM- 204. Count Primes

class Solution {
    public int countPrimes(int n) {
        boolean p[]=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++)
        {
            p[i]=true;
        }
        for(int i=2;i*i<n;i++)
        {
            if(p[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    p[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(p[i])
            c++;
        }
        return c;
    }
}

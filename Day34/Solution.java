// LEETCODE PROBLEM - 2483. Minimum Penalty for a Shop

class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int p[]=new int[n+1];
        int po=0;
        for(int i=0;i<n;i++)
        {
            if(customers.charAt(i)=='Y')
                p[0]++;
        }
        for(int i=1;i<=n;i++)
        {
            p[i]=p[i-1];
            if(customers.charAt(i-1)=='Y')
                p[i]--;
            else
                p[i]++;
            if(p[po]>p[i])
            {
                po=i;
            }
        }
        return po;
    }
}
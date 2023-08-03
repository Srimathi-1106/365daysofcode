//LEETCODE PROBLEM -1492. The kth Factor of n

class Solution {
    public int kthFactor(int n, int k) {
        int c=0,i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
            if(c==k)
            {
            return i;
            }
        }
        return -1;
    }
}
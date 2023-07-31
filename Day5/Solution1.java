//LEETCODE PROBLEM- 59. Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int k=1,i;
        int l=0,r=n-1,t=0,b=n-1;
        while(l<=r && t<=b)
        {
            for(i=l;i<=r;i++)
            {
                a[t][i]=k;
                k++;
            }
            t++;
            for(i=t;i<=b;i++)
            {
                a[i][r]=k;
                k++;
            }
            r--;
            if(t<=b)
            {
                for(i=r;i>=l;i--)
                {
                    a[b][i]=k;
                    k++;
                }
                b--;
            }
            if(l<=r)
            {
                for(i=b;i>=t;i--)
                {
                    a[i][l]=k;
                    k++;
                }
                l++;
            }
        }
        return a;
    }
}
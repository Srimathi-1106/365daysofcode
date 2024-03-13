// LEETCODE PROBLEM - 2485. Find the Pivot Integer

// if sum is a perfect square then its square root is its pivot;

class Solution {
    public int pivotInteger(int n) {
        int sum=(n*(n+1))/2;
        int pivot=(int)Math.sqrt(sum);
        if(pivot*pivot==sum)
        return pivot;
        else
        return -1;

    }
}

//normal approach

class Solution {
    public int pivotInteger(int n) {
        int pivot=-1,lsum=0,rsum=0;
        for(int i=1;i<=n;i++)
        lsum+=i;
        for(int i=n;i>=1;i--)
        {
            rsum+=i;
            if(lsum==rsum)
            {
                pivot=i;
                break;
            }
            else
            {
                lsum-=i;
            }
        }
        return pivot;
    }
}
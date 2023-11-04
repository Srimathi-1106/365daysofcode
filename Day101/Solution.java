// LEETCODE PROBLEM - 1503. Last Moment Before All Ants Fall Out of a Plank

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int m=n+1;
        for(int i=0;i<right.length;i++)
        {
            m=Math.min(m,right[i]);
        }
        m=n-m;
        for(int i=0;i<left.length;i++)
        {
            m=Math.max(m,left[i]);
        }
        return m;
    }
}
// LEETCODE PROBLEM - 3178. Find the Child Who Has the Ball After K Seconds

class Solution {
    public int numberOfChild(int n, int k) {
        int dn=(k/(n-1))%2;
        int moves=(k%(n-1));
        if(dn==0)
        {
            return moves;
        }
        else
        {
            return n-1-moves;
        }
    }
}
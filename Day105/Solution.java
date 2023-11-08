// LEETCODE PROBLEM - 2849. Determine if a Cell Is Reachable at a Given Time

class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int  x = Math.max(Math.abs(sx-fx),Math.abs(sy-fy));
        if(x==0)
        return t!=1;
        return x<=t;
    }
}
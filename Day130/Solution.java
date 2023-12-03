// LEETCODE PROBLEM - 1266. Minimum Time Visiting All Points

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0,x,y;
        for(int i=1;i<points.length;i++)
        {
            x=points[i][0]>points[i-1][0]?points[i][0]-points[i-1][0]:points[i-1][0]-points[i][0];
            y=points[i][1]>points[i-1][1]?points[i][1]-points[i-1][1]:points[i-1][1]-points[i][1];
            time+=Math.max(x,y);
        }
        return time;
    }
}
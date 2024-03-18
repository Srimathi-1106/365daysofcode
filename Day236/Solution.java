// LEETCODE PROBLEM - 452. Minimum Number of Arrows to Burst Balloons

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[],b[1]));
        int count=1,end=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(end<points[i][0])
            {
                count++;
                end=points[i][1];
            }
        }
        return count;
    }
}
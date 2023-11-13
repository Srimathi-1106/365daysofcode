// LEETCODE PROBLEM - 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,maxArea=0,currArea;
        while(l<r)
        {
            currArea=Math.min(height[l],height[r])*(r-l);
            maxArea=Math.max(maxArea,currArea);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return maxArea;
    }
}
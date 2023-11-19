// LEETCODE PROBLEM - 42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        int h=height.length;
        int lmax[]=new int[h];
        int rmax[]=new int[h];
        lmax[0]=height[0];
        for(int i=1;i<h;i++)
        {
            if(lmax[i-1]<height[i])
                lmax[i]=height[i];
            else
                lmax[i]=lmax[i-1];
        }
        rmax[h-1]=height[h-1];
        for(int j=h-2;j>=0;j--)
        {
            if(rmax[j+1]<height[j])
                rmax[j]=height[j];
            else
                rmax[j]=rmax[j+1];
        }
        int max=0;
        for(int i=0;i<h;i++)
        {
            max+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return max;
    }
}
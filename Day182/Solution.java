// LEETCODE PROBLEM - 3000. Maximum Area of Longest Diagonal Rectangle

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=0;
        int maxArea=0;
        for(int[] dimension:dimensions)
        {
            int length=dimension[0];
            int width=dimension[1];
            if(max<length*length+width*width || max==length*length+width*width && maxArea<length*width)
            {
                max=length*length+width*width;
                maxArea=length*width;
            }
        }
        return maxArea;
    }
}
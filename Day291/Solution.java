// LEETCODE PROBLEM - 2373. Largest Local Values in a Matrix

class Solution {
    public int[][] largestLocal(int[][] grid) 
    {
        int result[][]=new int[grid.length-2][grid[0].length-2];
        for(int i=0;i<grid.length-2;i++)
        {
            for(int j=0;j<grid[0].length-2;j++)
            {
                result[i][j]=findMax(i,j,grid);
            }
        }
        return result;
    }
    public int findMax(int r,int c,int grid[][])
    {
        int max=0;
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}
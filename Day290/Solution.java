// LEETCODE PROBLEM - 3142. Check if Grid Satisfies Conditions

class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i!=row-1 && grid[i][j]!=grid[i+1][j])
                {
                    return false;
                }
                if(j!=col-1 && grid[i][j]==grid[i][j+1])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
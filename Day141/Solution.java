// LEETCODE PROBLEM - 2482. Difference Between Ones and Zeros in Row and Column

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int onesRow[]=new int[grid.length];
        int onesColumn[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    onesRow[i]++;
                    onesColumn[j]++;
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                grid[i][j]=2*(onesRow[i]+onesColumn[j])-grid.length-grid[0].length;
            }
        }
        return grid;
    }
}
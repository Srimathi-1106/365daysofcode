// LEETCODE PROBLEM - 2923. Find Champion I

class Solution {
    public int findChampion(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    c++;
                }
            }
            if(c==1)
                return i;
            c-=c;
        }
        return -1;
    }
}
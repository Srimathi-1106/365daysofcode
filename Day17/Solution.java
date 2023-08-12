//LEETCODE PROBLEM - 63. Unique Paths II

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)
        return 0;
        int path[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        path[0][0]=1;
        for(int i=1;i<obstacleGrid.length;i++)
        {
            if(obstacleGrid[i][0]==0)
            path[i][0]=path[i-1][0];
        }
        for(int i=1;i<obstacleGrid[0].length;i++)
        {
            if(obstacleGrid[0][i]==0)
            path[0][i]=path[0][i-1];
        }
        for(int i=1;i<obstacleGrid.length;i++)
        {
            for(int j=1;j<obstacleGrid[i].length;j++)
            {
                if(obstacleGrid[i][j]==0)
                path[i][j]=path[i-1][j]+path[i][j-1];
            }
        }
        return path[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
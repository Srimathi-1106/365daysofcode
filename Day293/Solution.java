// LEETCODE PROBLEM - 1219. Path with Maximum Gold

class Solution {
    int max=0,r,c;
    boolean vis[][];
    public int getMaximumGold(int[][] grid) {
        r=grid.length;
        c=grid[0].length;
        vis=new boolean[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]!=0)
                dfs(i,j,grid,0);
            }
        }
        return max;
    }
    public void dfs(int i,int j,int grid[][],int sum)
    {
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j]==0 || vis[i][j])
        return;
        sum+=grid[i][j];
        vis[i][j]=true;
        if(max<sum)
        max=sum;
        dfs(i+1,j,grid,sum);
        dfs(i-1,j,grid,sum);
        dfs(i,j+1,grid,sum);
        dfs(i,j-1,grid,sum);
        vis[i][j]=false;
    }
}
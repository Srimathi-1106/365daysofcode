// LEETCODE PROBLEM - 2965. Find Missing and Repeated Values

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean val[]=new boolean[grid.length*grid[0].length+1];
        int result[]=new int[2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(val[grid[i][j]])
                {
                    result[0]=grid[i][j];
                }
                else
                {
                    val[grid[i][j]]=true;
                }
            }
        }
        for(int i=1;i<=grid.length*grid[0].length;i++)
        {
            if(!val[i])
            {
                result[1]=i;
                break;
            }
        }
        if(result[1]==0)
        result[1]=grid.length*grid[0].length;
        return result;
    }
}
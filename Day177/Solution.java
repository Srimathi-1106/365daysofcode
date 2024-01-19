// LEETCODE PROBLEM - 931. Minimum Falling Path Sum

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length,min,minPath;
        if(n==1)
        minPath=matrix[0][0];
        else
        minPath=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                {
                    min=Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                }
                else if(j==n-1)
                {
                    min=Math.min(matrix[i-1][j-1],matrix[i-1][j]);
                }
                else
                {
                    min=Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i-1][j+1]));
                }
                matrix[i][j]+=min;
                if(i==n-1)
                {
                    if(minPath>matrix[i][j])
                    minPath=matrix[i][j];
                }
            }
        }
        return minPath;
    }
}
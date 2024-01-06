// LEETCODE PROBLEM - 73. Set Matrix Zeroes

class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int row1=1;
        for(int i=0;i<c;i++)
        {
            if(matrix[0][i]==0)
            {
                row1=0;
                break;
            }
        }
        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=r-1;i>=1;i--)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                matrix[i][j]=0;
            }
        }
        if(row1==0)
        {
            for(int i=0;i<c;i++)
            {
                matrix[0][i]=0;
            }
        }
    }
}
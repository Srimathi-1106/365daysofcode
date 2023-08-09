//LEETCODE PROBLEM- 48. Rotate Image

class Solution {
    public void rotate(int[][] matrix) {
        int a[]=new int[matrix.length*matrix.length];
        short k=0;
        for(int i=matrix.length-1;i>=0;i--)
        {
            for(int j=0;j<matrix.length;j++)
            {
                a[k]=matrix[i][j];
                k++;
            }  
        }
        k=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[j][i]=a[k];
                k++;
            }
        }
    }
}
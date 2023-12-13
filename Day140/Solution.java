// LEETCODE PROBLEM - 1582. Special Positions in a Binary Matrix

class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int[] row:mat)
        {
            if(rowSum(row)==1)
            {
                int col=indexOfOne(row);
                count+=(columnSum(mat,col)==1)?1:0;
            }
        }
        return count;
    }
    private int indexOfOne(int row[])
    {
        for(int i=0;i<row.length;i++)
        {
            if(row[i]==1)
            return i;
        }
        return 0;
    }
    private int rowSum(int row[])
    {
        int sum=0;
        for(int ele:row)
        {
            sum+=ele;
        }
        return sum;
    }
    private int columnSum(int mat[][],int col)
    {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            sum+=mat[i][col];
        }
        return sum;
    }
}
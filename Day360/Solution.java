// LEETCODE PROBLEM - 1605. Find Valid Matrix Given Row and Column Sums

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int result[][]=new int[rowSum.length][colSum.length];
        int row=0,col=0;
        while(row<rowSum.length && col<colSum.length)
        {
            result[row][col]=Math.min(rowSum[row],colSum[col]);
            rowSum[row]-=result[row][col];
            colSum[col]-=result[row][col];
            if(rowSum[row]==0)
            row++;
            else
            col++;
        }
        return result;
    }
}
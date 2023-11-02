// LEETCODE PROBLEM - 2643. Row With Maximum Ones

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int res[] =new int[2];
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                c+=mat[i][j];
            }
            if(c>res[1])
            {
                res[0]=i;
                res[1]=c; 
            }
        }
        return res;
    }
}
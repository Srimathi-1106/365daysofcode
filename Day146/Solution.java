// LEETCODE PROBLEM - 661. Image Smoother

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int r=img.length,c=img[0].length,mat[][]=new int[r][c],count,sum;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum=0;
                count=0;
                for(int l=i-1;l<=i+1;l++)
                {
                    for(int m=j-1;m<=j+1;m++)
                    {
                        if(l>=0 && l<r && m>=0 && m<c)
                        {
                            sum+=img[l][m];
                            count++;
                        }
                    }
                }
                mat[i][j]=sum/count;
            }
        }
        return mat;
    }
}

// LEETCODE PROBLEM - 3033. Modify the Matrix

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length,max;
        boolean flag;
        for(int i=0;i<c;i++)
        {
            flag=false;
            for(int j=0;j<r;j++)
            {
                if(matrix[j][i]==-1)
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                List<Integer> ones=new ArrayList<>(); 
                max=0;
                for(int j=0;j<r;j++)
                {
                    if(matrix[j][i]==-1)
                    {
                        ones.add(j);
                    }
                    if(max<matrix[j][i])
                    max=matrix[j][i];
                }
                for(int j=0;j<ones.size();j++)
                {
                    matrix[ones.get(j)][i]=max;
                }
            }
        }
        return matrix;
    }
}
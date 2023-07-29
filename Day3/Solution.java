//LEETCODE PROBLEM-54. Spiral Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        int t=0,b=matrix.length-1,ri=matrix[0].length-1,l=0;
        List<Integer> a=new ArrayList<Integer>();
        while(t<=b && l<=ri)
        {
            for(int i=l;i<=ri;i++)
            {
                a.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                a.add(matrix[i][ri]);
            }
            ri--;
            if(t<=b)
            {
                for(int i=ri;i>=l;i--)
                {
                    a.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=ri)
            {
                for(int i=b;i>=t;i--)
                {
                    a.add(matrix[i][l]);
                }
                l++;
            }
        }
        return a;
    }
}
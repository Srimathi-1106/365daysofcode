//LEETCODE PROBLEM - 1337. The K Weakest Rows in a Matrix

import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int c[]=new int[mat.length];
        Integer p[]=new Integer[mat.length];
        int r[]=new int[k];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c[i]++;
                }
            }
            p[i]=i;
        }
        Arrays.sort(p , (a,b)-> Integer.compare(c[a],c[b]));
        for(int i=0;i<k;i++)
        {
            r[i]=p[i];
        }
        return r;
    }
}
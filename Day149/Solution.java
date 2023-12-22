// LEETCODE PROBLEM - 1422. Maximum Score After Splitting a String

class Solution {
    public int maxScore(String s) {
        int one=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                one++;
        }
        int zero=0,max=0;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)=='0')
            {
                zero++;
            }
            else 
            {
                one--;
            }
            if(max<zero+one)
            {
                max=zero+one;
            }
        }
        return max;
    }
}
// LEETCODE PROBLEM - 2864. Maximum Odd Binary Number

class Solution {
    public String maximumOddBinaryNumber(String s) {
        short c[]=new short[2];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            c[1]++;
            else
            c[0]++;
        }
        StringBuilder sb=new StringBuilder(s.length());
        for(int i=0;i<s.length()-1;i++)
        {
            if(c[1]>1)
            {
                sb.append('1');
                c[1]--;
            }
            else 
            {
                if(c[0]>0)
                {
                    sb.append('0');
                    c[0]--;
                }
            }
        }
        sb.append('1');
        return sb.toString();
    }
}

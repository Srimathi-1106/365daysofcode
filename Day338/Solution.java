// LEETCODE PROBLEM - 6. Zigzag Conversion

class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows || numRows==1)
        return s;
        int row_2,numRows_2=2*numRows,index=0,n=s.length();
        char s_arr[]=s.toCharArray();
        char result[]=new char[n];
        for(int row=0;row<numRows;row++)
        {
            row_2=2*row;
            if((row==0 || row==numRows-1))
            {
                for(int i=row;i>=0 && i<n;i+=numRows_2-2)
                {
                    result[index]=s_arr[i];
                    index++;
                }
            }
            else
            {
                int dn=0;
                for(int j=row;j<n;)
                {
                    result[index]=s_arr[j];
                    index++;
                    if(dn==0)
                    {
                        j+=numRows_2-row_2-2;
                        dn=1;
                    }
                    else
                    {
                        j+=row_2;
                        dn=0;
                    }
                }
            }
        }
        return new String(result);
    }
}
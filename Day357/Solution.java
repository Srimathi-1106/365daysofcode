// LEETCODE PROBLEM - 8. String to Integer (atoi)

class Solution {
    public int myAtoi(String s) {
        long result=0;
        int sign=0,flag=0;
        for(char c:s.toCharArray())
        {
            if(((c=='-' || c=='+') && flag==0) || (Character.isDigit(c)))
            {
                if(c=='-')
                {
                    sign=1;
                }
                else if(c=='+')
                {
                    
                }
                else
                {
                    result=result*10+(c-'0');
                    if(result>=Integer.MAX_VALUE && sign==0)
                    return Integer.MAX_VALUE;
                    else if(sign==1 && result*-1<=Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
                }
                flag=1;
            }
            else if(c==' ' && flag==0)
            {
                continue;
            }
            else
            break;
        }
        if(sign==1)
        result*=-1;
        return (int)result;
    }
}
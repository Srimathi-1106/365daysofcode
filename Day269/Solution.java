// LEETCODE PROBLEM - 3114. Latest Time You Can Obtain After Replacing Characters

class Solution {
    public String findLatestTime(String s) {
        char str[]=s.toCharArray();
        for(int i=0;i<5;i++)
        {
            if(str[i]=='?')
            {
                switch(i)
                {
                    case 0:if(str[1]=='?'||str[1]=='1' || str[1]=='0')
                    str[0]='1';
                    else
                    str[0]='0';
                    break;
                    case 1:
                    if(str[0]=='1' || str[0]=='?')
                    str[1]='1';
                    else
                    str[1]='9';
                    break;
                    case 3:str[3]='5';
                    break;
                    case 4:str[4]='9';
                }
            }
        }
        return String.valueOf(str);
    }
}
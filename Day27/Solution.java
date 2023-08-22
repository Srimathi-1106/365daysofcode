// LEETCODE PROBLEM - 168. Excel Sheet Column Title

class Solution {
    public String convertToTitle(int a) {
        StringBuilder str=new StringBuilder();
        short d;
        while(a>26)
        {
            d=(short)(a%26);
            if(d==0)
            {
                str.append('Z');
                a-=1;
            }
            else
            str.append((char)(64+d));
            a/=26;
        }   
        str.append((char)(64+a));
        str.reverse();
        return str.toString();
    }
}
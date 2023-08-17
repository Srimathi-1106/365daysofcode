//LEETCODE PROBLEM - 541. Reverse String II

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str=new StringBuilder();
        boolean c=false;
        int n=s.length();
        int i;
        if(k>n-1)
        {
            str.append(s.substring(0,n));
            str.reverse();
            return str.toString();
        }
        for(i=0;i<n-k+1;i=i+k)
        {
            StringBuilder sb=new StringBuilder(s.substring(i,i+k));
            if(!c)
            {
                sb.reverse();
                c=true;
            }
            else
            {
                c=false;
            }
            str.append(sb);
        }
        if(i-k<n-1)
        {
            if(!c)
            {
                StringBuilder sb=new StringBuilder(s.substring(i,n));
                str.append(sb.reverse());
            }
            else
            str.append(s.substring(i,n));
        }
        return str.toString();
    }
}
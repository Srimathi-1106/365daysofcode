// LEETCODE PROBLEM - 2696. Minimum String Length After Removing Substrings

class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        int a;
        while(sb.indexOf("AB")!=-1 || sb.indexOf("CD")!=-1)
        {
            a=sb.indexOf("AB");
            if(a!=-1)
            sb.delete(a,a+2);
            a=sb.indexOf("CD");
            if(a!=-1)
            sb.delete(a,a+2);
        }
        return sb.length();
    }
}
// LEETCODE PROBLEM - 2716. Minimize String Length

class Solution {
    public int minimizedStringLength(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-97]=1;
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(a[i]==1)
            c++;
        }
        return c;
    }
}
// LEETCODE PROBLEM - 647. Palindromic Substrings

class Solution {
    public int count=0,n;
    char s[];
    public int countSubstrings(String str) {
        n=str.length();
        s=str.toCharArray();
        for(int i=0;i<n;i++)
        {
            palindrome(i,i);
            palindrome(i,i+1);
        }
        return count;
    }
    public void palindrome(int start,int end)
    {
        while(start>=0 && end<n && s[start]==s[end])
        {
            start--;
            end++;
            count++;
        }
    }
}
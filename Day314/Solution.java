// LEETCODE PROBLEM - 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        int fre[]=new int[58];
        for(char c:s.toCharArray())
        {
            fre[c-65]++;
        }
        int max_len=0;
        boolean hasOdd=false;
        for(int f:fre)
        {
            if(f%2==0)
            {
                max_len+=f;
            }
            else
            {
                max_len+=f-1;
                hasOdd=true;
            }
        }
        if(hasOdd)
        {
            max_len++;
        }
        return max_len;
    }
}
// LEETCODE PROBLEM - 2108. Find First Palindromic String in the Array

class Solution {
    public String firstPalindrome(String[] words) {
        int l,r;
        for(String word:words)
        {
            l=0;r=word.length()-1;
            while(l<r && word.charAt(l)==word.charAt(r))
            {
                l++;
                r--;
            }
            if(l>=r)
            return word;
        }
        return "";
    }
}
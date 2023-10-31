// LEETCODE PROBLEM - 125. Valid Palindrome

import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        int j=s.length();
        if(j==0 || j==1)
        return true;
        int i=0;
        j--;
        while(i<=j)
        {
            while(i<j && ! Character.isLetterOrDigit(s.charAt(i)))
            i++;
            while(i<j && ! Character.isLetterOrDigit(s.charAt(j)))
            j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}
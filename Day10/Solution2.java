//LEETCODE PROBLEM- 28. Find the Index of the First Occurrence in a String
 
class Solution {
    public int strStr(String haystack, String needle) {
        for(short i=0;i<=haystack.length()-needle.length();i++)
        {
            if(haystack.substring(i,i+needle.length()).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}
//LEETCODE PROBLEM - 14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int i=0;
        while(i<strs.length)
        {
            while(strs[i].indexOf(s)!=0)
            {
                s=s.substring(0,s.length()-1);
            }
            i++;
        }
        return s;
    }
}
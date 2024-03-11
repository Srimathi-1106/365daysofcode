// LEETCODE PROBLEM  - 791. Custom Sort String

class Solution {
    public String customSortString(String order, String s) {
        StringBuilder result=new StringBuilder();
        int fre[]=new int[26];
        for(char character:s.toCharArray())
        {
            fre[character-97]++;
        }
        for(char character:order.toCharArray())
        {
            while(fre[character-97]-->0)
            {
                result.append(character);
            }
        }
        for(int i=0;i<26;i++)
        {
            while(fre[i]-->0)
            {
            result.append((char)(i+97));
            }
        }
        return result.toString();
    }
}
// LEETCODE PROBLEM - 2828. Check if a String Is an Acronym of Words

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length()!=words.size())
        return false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=words.get(i).charAt(0))
            return false;
        }
        return true;
    }
}
// LEETCODE PROBLEM - 1657. Determine if Two Strings Are Close

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
        return false;
        int fre[]=new int[26];
        int fre1[]=new int[26];
        for(char character:word1.toCharArray())
        {
            fre[character-97]++;
        }
        for(char character:word2.toCharArray())
        {
            if(fre[character-97]==0)
            return false;
            fre1[character-97]++;  
        }
        Arrays.sort(fre);
        Arrays.sort(fre1);
        return Arrays.equals(fre,fre1);
    }
}
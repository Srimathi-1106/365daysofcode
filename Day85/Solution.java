// LEETCODE PROBLEM - 2586. Count the Number of Vowel Strings in Range

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1)))
            {
                c++;
            }
        }
        return c;
    }
    boolean isVowel(char a)
    {
        if( a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
        return true;
        return false;
    }
}
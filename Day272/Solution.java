// LEETCODE PROBLEM - 3121. Count the Number of Special Characters II

class Solution {
    public int numberOfSpecialChars(String word) {
        int fre[]=new int[26];
        int count=0;
        for(char character:word.toCharArray())
        {
            if(Character.isUpperCase(character))
            {
                if(fre[character-65]==1)
                {
                    fre[character-65]=3;
                }
                else if(fre[character-65]==0)
                {
                    fre[character-65]=4;
                }
            }
            else
            {
                if(fre[character-97]==3)
                {
                    fre[character-97]=4;
                }
                else if(fre[character-97]==0)
                {
                    fre[character-97]=1;
                }
            }
        }
        for(int i=0;i<26;i++)
        {
            if(fre[i]==3)
            count++;
        }
        return count;
    }
}
// LEETCODE PROBLEM - 3136. Valid Word

class Solution {
    public boolean isValid(String word) {
        boolean vowel=false,consonant=false;
        if(word.length()>=3)
        {
            for(int i=0;i<word.length();i++)
            {
                char a=word.charAt(i);
                if(Character.isLetterOrDigit(a))
                {
                    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
                    vowel=true;
                    else if(!Character.isDigit(a))
                    consonant=true;
                }
                else
                return false;
            }
            return consonant && vowel;
        }
        return false;
    }
}
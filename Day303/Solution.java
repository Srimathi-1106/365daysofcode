// LEETCODE PROBLEM - 2490. Circular Sentence

class Solution {
    public boolean isCircularSentence(String sentence) {
        String str[]=sentence.split(" ");
        for(int i=0;i<str.length-1;i++)
        {
            if(Character.toLowerCase(str[i].charAt(str[i].length()-1))!=Character.toLowerCase(str[i+1].charAt(0)))
            return false;
        }
        if(str[0].charAt(0)!=str[str.length-1].charAt(str[str.length-1].length()-1))
        return false;
        return true;
    }
}
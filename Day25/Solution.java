// LEETCODE PROBLEM - 1816. Truncate Sentence

class Solution {
    public String truncateSentence(String s, int k) {
        int c=0,c1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && c1<k)
                c1++;
            if(c1==k)
            {
                c=i;
                break;
            }
            else
            {
                c=s.length();
            }
        }
        return s.substring(0,c);
    }
}
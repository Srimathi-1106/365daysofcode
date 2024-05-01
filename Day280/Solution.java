// LEETCODE PROBLEM - 2000. Reverse Prefix of Word

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int i,n=word.length();
        for(i=0;i<n;i++)
        {
            if(word.charAt(i)==ch)
            {
                break;
            }
        }
        if(i!=n)
        {
            sb.append(word.substring(0,i+1));
            sb.reverse();
            sb.append(word.substring(i+1,n));
            return sb.toString();
        }
        return word;
    }
}
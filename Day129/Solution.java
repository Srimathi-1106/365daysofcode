// LEETCODE  PROBLEM - 1160. Find Words That Can Be Formed by Characters

class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        int freq[]=new int[26];
        for(int i=0;i<chars.length();i++)
        {
            freq[chars.charAt(i)-97]++;
        }
        for(var word:words){
            int flag=0;
            int fre[]=new int[26];
            for(int i=0;i<word.length();i++)
            {
                fre[word.charAt(i)-97]++;
            }
            for(int i=0;i<26;i++)
            {
                if(freq[i]<fre[i])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                count+=word.length();
            }
        }
        return count;
    }
}
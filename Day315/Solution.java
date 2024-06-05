// LEETCODE PROBLEM - 1002. Find Common Characters

class Solution {
    public List<String> commonChars(String[] words) {
        int fre[]=new int[26];
        for(int i=0;i<words[0].length();i++)
        {
            fre[words[0].charAt(i)-'a']++;
        }
        for(String word:words)
        {
            int fre1[]=new int[26];
            for(int i=0;i<word.length();i++)
            {
                fre1[word.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                if(fre[i]>fre1[i])
                {
                    fre[i]=fre1[i];
                }
            }
        }
        List<String> common=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(fre[i]!=0)
            {
                common.add(((char)(97+i))+"");
                fre[i]--;
            }
        }
        return common;
    }
}
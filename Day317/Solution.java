// LEETCODE PROBLEM - 648. Replace Words

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[]=sentence.split(" ");
        int i=0;
        for(String word:words)
        {
            words[i]=replaceWords(word,dictionary);
            i++;
        }
        return String.join(" ",words);
    }
    public String replaceWords(String word,List<String> dict)
    {
        String result=word;
        for(String d:dict)
        {
            int i=0;
            while(i<result.length() && i<d.length() && result.charAt(i)==d.charAt(i))
            {
                i++;
            }
            if(i==d.length())
            result=result.length()<d.length()?result:d;
        }
        return result;
    }
}

// LEETCODE PROBLEM - 1897. Redistribute Characters to Make All Strings Equal

class Solution {
    public boolean makeEqual(String[] words) {
        int alphabetsFrequency[]=new int[26];
        for(String word:words)
        {
            for(char letter:word.toCharArray())
            {
                alphabetsFrequency[letter-'a']++;
            }
        }
        int stringArraylength=words.length;
        for(int eachFrequency:alphabetsFrequency)
        {
            if(eachFrequency%stringArraylength!=0)
                return false;
        }
        return true;
    }
}
// LEETCODE  PROBLEM - 1347. Minimum Number of Steps to Make Two Strings Anagram

class Solution {
    public int minSteps(String s, String t) {
        int frequency[]=new int[26];
        for(char character:s.toCharArray())
        {
            frequency[character-97]++;
        }
        for(char character:t.toCharArray())
        {
            frequency[character-97]--;  
        }
        int minSteps=0;
        for(int fre:frequency)
        {
            if(fre>0)
            minSteps+=fre;
        }
        return minSteps;
    }
}
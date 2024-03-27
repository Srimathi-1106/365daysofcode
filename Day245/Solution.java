// LEETCODE PROBLEM - 2278. Percentage of Letter in String

class Solution {
    public int percentageLetter(String s, char letter) {
        int frequency=0;
        for(char c:s.toCharArray())
        {
            if(c==letter)
            frequency++;
        }
        return (frequency*100)/s.length();
    }
}
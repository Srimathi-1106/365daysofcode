// LEETCODE PROBLEM - 1662. Check If Two String Arrays are Equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(var word:word1)
        {
            str1.append(word);
        }
        for(var word:word2)
        {
            str2.append(word);
        }
        if(str1.toString().equals(str2.toString()))
        return true;
        return false;
    }
}
// LEETCODE PROBLEM - 3210. Find the Encrypted String

class Solution {
    public String getEncryptedString(String s, int k) {
        int len=s.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            result.append(s.charAt((i+k)%len));
        }
        return result.toString();
    }
}
// LEETCODE PROBLEM - 3083. Existence of a Substring in a String and Its Reverse

class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i=0;i<s.length()-1;i++)
        {
            String sub=new StringBuilder(s.substring(i,i+2)).reverse().toString();
            if(s.contains(sub))
            return true;
        }
        return false;
    }
}
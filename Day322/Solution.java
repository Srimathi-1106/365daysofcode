// LEETCODE PROBLEM - 3174. Clear Digits

class Solution {
    public String clearDigits(String s) {
        StringBuilder result=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                if(result.length()!=0)
                {
                    result.deleteCharAt(result.length()-1);
                }
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
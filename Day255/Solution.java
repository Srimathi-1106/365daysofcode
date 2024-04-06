// LEETCODE PROBLEM - 1249. Minimum Remove to Make Valid Parentheses

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result=new StringBuilder(s);
        int count=0;
        for(int i=0;i<result.length();i++)
        {
            if(result.charAt(i)==')')
            {
                if(count==0)
                {
                    System.out.println(i);
                    result.delete(i,i+1);
                    i--;
                }
                else
                {
                    count--;
                }
            }
            else if(result.charAt(i)=='(')
            {
                count++;
            }
        }
        for(int i=result.length()-1;i>=0;i--)
        {
            if(count>0 && result.charAt(i)=='(')
            {
                result.delete(i,i+1);
                count--;
            }
        }
        return result.toString();
    }
}
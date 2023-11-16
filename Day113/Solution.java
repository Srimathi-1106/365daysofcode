// LEETCODE PROBLEM - 20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack a=new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
            a.push(s.charAt(i));
            else if(a.isEmpty())
            return false;
            else if(s.charAt(i)=='}' && a.peek().equals('{'))
            a.pop();
            else if(s.charAt(i)==']' && a.peek().equals('['))
            a.pop();
            else if(s.charAt(i)==')' && a.peek().equals('('))
            a.pop();
            else
            return false;
        }
        return a.isEmpty();
    } 
}
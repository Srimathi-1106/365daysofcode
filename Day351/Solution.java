// LEETCODE PROBLEM - 1190. Reverse Substrings Between Each Pair of Parentheses

class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder result= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty() && s.charAt(i)!='(')
            {
                result.append(s.charAt(i));
            }
            else
            {
                if(s.charAt(i)==')')
                {
                    StringBuilder res=new StringBuilder();
                    while(!stack.isEmpty() && stack.peek()!='(')
                    {
                        res.append(stack.pop());
                    }
                    if(!stack.isEmpty())
                    stack.pop();
                    if(stack.isEmpty())
                    {
                        result.append(res);
                    }
                    if(!stack.isEmpty())
                    {
                        for(int j=0;j<res.length();j++)
                        {
                            stack.push(res.charAt(j));
                        }
                    }
                }
                else
                stack.push(s.charAt(i));
            }
        }
        return result.toString();
    }
}
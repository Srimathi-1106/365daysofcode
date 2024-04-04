// LEETCODE PROBLEM - 1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {
        int count=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
                max=Math.max(count,max);
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
        }
        return max;
    }
}
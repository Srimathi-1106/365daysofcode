// LEETCODE PROBLEM - 150. Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(var val:tokens)
        {
            if(val.equals("+"))
            {
                stack.push(stack.pop()+stack.pop());
            }    
            else if(val.equals("-"))
            {
                int a=stack.pop();
                stack.push(stack.pop()-a);
            }
            else if(val.equals("*"))
            {
                stack.push(stack.pop()*stack.pop());
            } 
            else if(val.equals("/"))
            {
                int a=stack.pop();
                stack.push(stack.pop()/a);
            }
            else
            {
                stack.push(Integer.parseInt(val));
            }
        }
        return stack.pop();
    }
}
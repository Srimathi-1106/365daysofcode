//LEETCODE PROBLEM- 509. Fibonacci Number

class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=n;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;          
        }
        return c;
    }
}
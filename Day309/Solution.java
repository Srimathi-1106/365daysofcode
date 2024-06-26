// LEETCODE PROBLEM - 1404. Number of Steps to Reduce a Number in Binary Representation to One

class Solution {
    public int numSteps(String s) {
        int carry=0,steps=0;
        for(int i=s.length()-1;i>0;i--)
        {
            if(s.charAt(i)-'0'+carry==1)
            {
                steps+=2;
                carry=1;
            }
            else
            {
                steps++;
            }
        }
        return steps+carry;
    }
}
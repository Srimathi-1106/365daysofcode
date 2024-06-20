// LEETCODE PROBLEM - 633. Sum of Square Numbers

class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0,j=(int)Math.sqrt(c);
        if((int)Math.sqrt(c)*(int)Math.sqrt(c)==c)
        return true;
        while(i<=j)
        {
            long squareSum=(long)i*i+(long)j*j;
            if(squareSum==c)
            {
                return true;
            }
            else if(squareSum<c)
            {
                i++;
            }
            else 
            {
                j--;
            }
        }
        return false;
    }
}
// LEETCODE PROBLEM - 326. Power of Three

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1 || n==3)
        return true;
        while(n>3)
        {
            if(n%3==0)
            {
                n=n/3;
            }
            else
            {
                return false;
            }
            if(n==3)
            {
                return true;
            }
        }
        return false;
    }
}
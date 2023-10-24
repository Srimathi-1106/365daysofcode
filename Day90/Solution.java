// LEETCODE PROBLEM - 231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2)
        return true;
        while(n>2 && n%2==0)
        {
            n/=2;
            if(n==2)
            {
                return true;
            }
        }
        return false;
    }
}
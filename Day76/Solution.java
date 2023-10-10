// LEETCODE PROBLEM - 7. Reverse Integer

class Solution {
    public int reverse(int x) {
        long r=0;
        byte f=0;
        if(x<0)
        {
            f=1;
            x=-1*x;
        }
        while(x>0)
        {
            r=r*10+(x%10);
            x/=10;
        }
        if(r>2147483647)
        return 0;
        if(f==1)
        return (int)r*-1;
        else
        return (int)r;
    }
}
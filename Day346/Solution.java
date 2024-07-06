// LEETCODE PROBLEM - https://leetcode.com/problems/pass-the-pillow/description/

class Solution {
    public int passThePillow(int n, int time) {
        int person=1,d=0;
        for(int i=1;i<=time;i++)
        {
            if(person==n)
            d=1;
            if(person==1)
            d=0;
            if(d==0)
            person++;
            else
            person--;
        }
        return person;
    }
}
// LEETCODE PROBLEM - 1550. Three Consecutive Odds

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int len=0;
        for(int a:arr)
        {
            if(a%2==0)
            {
                len=0;
            }
            else
            {
                len++;
            }
            if(len==3)
            return true;
        }
        return false;
    }
}
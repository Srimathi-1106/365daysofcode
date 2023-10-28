// LEETCODE PROBLEM - 371. Sum of Two Integers

class Solution {
    public int getSum(int a, int b) {
        int r=a^b;
        if((a&b)<< 1 !=0)
        {
            return getSum(r,(a&b)<< 1);
        }
        return r;
    }
}
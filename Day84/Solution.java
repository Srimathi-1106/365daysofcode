// LEETCODE PROBLEM - 2894. Divisible and Non-divisible Sums Difference

class Solution {
    public int differenceOfSums(int n, int m) {
        int ts=n*(n+1)/2;
        int ds=(n/m)*((n/m)+1)/2*m;
        ts-=ds;
        return ts-ds;
    }
}
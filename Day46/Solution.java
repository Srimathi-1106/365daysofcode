// LEETCODE PROBLEM - 1359. Count All Valid Pickup and Delivery Options

class Solution {
    public int countOrders(int n) {
        long c=1;
        for(int i=2;i<=n;i++)
        {
            c=(c*((2*i-1)*((2*i-1)+1)/2))%(int)(Math.pow(10,9)+7);
        }
        return (int)c;
    }
}
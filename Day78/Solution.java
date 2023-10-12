// LEETCODE PROBLEM - 1518. Water Bottles

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int t=numBottles;
        int pt=numBottles/numExchange;
        while(pt>=1)
        { 
            t+=pt;
            numBottles=numBottles%numExchange+pt;
            pt=numBottles/numExchange;
        }
        return t;
    }
}
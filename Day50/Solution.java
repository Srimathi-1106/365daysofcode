// LEETCODE PROBLEM - 2651. Calculate Delayed Arrival Time

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime+delayedTime>=24)
        {
            return arrivalTime+delayedTime-24;
        }
        return arrivalTime+delayedTime;
    }
}
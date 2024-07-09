// LEETCODE PROBLEM - 1701. Average Waiting Time

class Solution {
    public double averageWaitingTime(int[][] customers) {
        int startTime=customers[0][0];
        double totalTime=0;
        for(int[] customer:customers)
        {
            if(startTime<customer[0])
            {
                startTime=customer[0];
            }
            startTime+=customer[1];
            totalTime+=startTime-customer[0];
        }
        return totalTime/customers.length;
    }
}
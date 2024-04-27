// LEETCODE PROBLEM - 2960. Count Tested Devices After Test Operations

class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count=0;
        for(int batteryPercentage:batteryPercentages)
        {
            if(batteryPercentage>count)
            count++;
        }
        return count;
    }
}
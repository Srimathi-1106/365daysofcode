// LEETCODE PROBLEM - 739. Daily Temperatures

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] result=new int[n];
        int hottest=0;
        int days;
        for(int i=n-1;i>=0;i--)
        {
            if(temperatures[i]>=hottest)
            {
                hottest=temperatures[i];
                continue;
            }
            days=1;
            while(temperatures[i]>=temperatures[i+days])
            {
                days+=result[i+days];
            }
            result[i]=days;
        }
        return result;
    }
}
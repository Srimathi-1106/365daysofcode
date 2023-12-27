// LEETCODE PROBLEM - 1578. Minimum Time to Make Rope Colorful

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int n=colors.length();
        for(int i=0;i<n-1;i++)
        {
            if(colors.charAt(i)==colors.charAt(i+1))
            {
                sum+=Math.min(neededTime[i],neededTime[i+1]);
                neededTime[i+1]=Math.max(neededTime[i],neededTime[i+1]);
            }
        }
        return sum;    
    }
}
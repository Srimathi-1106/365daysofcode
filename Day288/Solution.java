// LEETCODE PROBLEM - 3075. Maximize Happiness of Selected Children

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int index=happiness.length-1;
        long maxHappiness=0;
        long decay=0;
        while(k!=0)
        {
            long happy=happiness[index]-decay;
            maxHappiness+=happy>0?happy:0;
            decay++;
            index--;
            k--;
        }
        return maxHappiness;
    }
}
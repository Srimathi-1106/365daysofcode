// LEETCODE PROBLEM - 1207. Unique Number of Occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int frequencyCount[]=new int[2001];
        boolean occuredFrequency[]=new boolean[1001];
        for(int num:arr)
        {
            frequencyCount[num+1000]++;
        }
        for(int count:frequencyCount)
        {
            if(count!=0)
            {
                if(occuredFrequency[count])
                return false;
                occuredFrequency[count]=true;
            }
        }
        return true;
    }
}
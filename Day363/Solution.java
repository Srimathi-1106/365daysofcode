// LEETCODE PROBLEM - 1636. Sort Array by Increasing Frequency

class Solution {
    public int[] frequencySort(int[] nums) {
        int fre[][]=new int[201][2];
        for(int num:nums)
        {
            fre[num+100][1]++;
        }
        for(int i=-100;i<=100;i++)
        {
            fre[i+100][0]=i;
        }
        Arrays.sort(fre,(a,b)->{
            if(a[1]==b[1])
            return b[0]-a[0];
            return a[1]-b[1];
        });
        
        int result[]=new int[nums.length];
        int index=0;
        for(int i=0;i<=200;i++)
        {
            while(fre[i][1]>0)
            {
                result[index++]=fre[i][0];
                fre[i][1]--;
            }
        }
        return result;
    }
}
// LETCODE PROBLEM - 3005. Count Elements With Maximum Frequency

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int fre[]=new int[101];
        int count=0,max=0;
        for(int num:nums)
        {
            fre[num]++;
            if(fre[num]>max)
            {
                max=fre[num];
                count=max;
            }
            else if(fre[num]==max)
            {
                count+=max;
            }
        }
        return count;
    }
}
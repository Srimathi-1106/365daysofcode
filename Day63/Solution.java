//LEETCODE PROBLEM - 2644. Find the Maximum Divisibility Score

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n=divisors.length;
        int score[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]%divisors[j]==0)
                {
                    score[j]++;
                }
            }
        }
        int max=score[0],p=0;
        for(int i=1;i<n;i++)
        {
            if(max<score[i])
            {
                max=score[i];
                p=i;
            }
            else if(max==score[i])
            {
                p=divisors[p]>divisors[i]?i:p;
            }
        }
        return divisors[p];
    }
}
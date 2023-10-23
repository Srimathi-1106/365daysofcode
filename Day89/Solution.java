// LEETCODE PROBLEM - 2903. Find Indices With Index and Value Difference I

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int r[]=new int[2];
        r[0]=-1;
        r[1]=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=Math.abs(indexDifference-i);j<n;j++)
            {
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j]) >= valueDifference)  
                {
                    r[0]=i;
                    r[1]=j;
                    n=0;
                    break;
                }
            } 
        }
        return r;
    }
}
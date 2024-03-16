// LEETCODE PROBLEM - 525. Contiguous Array

//Using HashMap
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> prevSum=new HashMap<>();
        prevSum.put(0,-1);
        int currSum=0,max=0;
        int i=0;
        for(int num:nums)
        {
            currSum+=num==0?-1:1;
            if(prevSum.containsKey(currSum))
            {
                max=Math.max(max,i-prevSum.get(currSum));
            }
            else
            {
                prevSum.put(currSum,i);
            }
            i++;
        }
        return max;
    }
}

//Using Array
class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int prevSum[]=new int[2*n+1];// 2*n+1 to represent negative and positive 0 to n-1 index points negative currSum and n+1 to 2*n+1 points to positive currSum and n points to 0th index
        Arrays.fill(prevSum,-2);
        prevSum[n]=-1;
        int max=0,currSum=0;
        for(int i=0;i<n;i++)
        {
            currSum+=nums[i]==0?-1:1;
            if(prevSum[currSum+n]>=-1)
            {
                max=Math.max(max,i-prevSum[currSum+n]);
            }
            else
            {
                prevSum[currSum+n]=i;
            }
        }
        return max;
    }
}
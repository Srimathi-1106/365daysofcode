// LEETCODE PROBLEM - 2870. Minimum Number of Operations to Make Array Empty

class Solution {
    public int minOperations(int[] nums) {
        int minOp=0,num,count,n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;)
        {
            num=nums[i];
            count=0;
            while(i<n && nums[i]==num)
            {
                count++;
                i++;
            }
            if(count==1)
            {
                return -1;
            }
            else
            {
                minOp+=count/3;
                minOp+=count%3==0?0:1;
            }
        }
        return minOp;
    }
}
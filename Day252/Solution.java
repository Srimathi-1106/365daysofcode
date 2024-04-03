// LEETCODE PROBLEM - 3079. Find the Sum of Encrypted Integers

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0,temp,count,max,dig;
        for(int num:nums)
        {
            temp=num;
            count=0;
            max=Integer.MIN_VALUE;
            while(temp>0)
            {
                dig=temp%10;
                temp/=10;
                max=Math.max(max,dig);
                count++;
            }
            temp=0;
            while(count>0)
            {
                temp=temp*10+max;
                count--;
            }
            sum+=temp;
        }
        return sum;
    }
}
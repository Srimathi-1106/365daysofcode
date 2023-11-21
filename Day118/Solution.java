// LEETCODE PROBLEM - 1814. Count Nice Pairs in an Array

class Solution {
    static int rev(int n){
        if(n<=9)
        return n;
        int a=0;
        while(n>0)
        {
            a=(a*10)+n%10;
            n/=10;
        }
        return a;
    }
    public int countNicePairs(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            nums[i]=nums[i]-rev(nums[i]);
        }
        Arrays.sort(nums);
        long pairs=0;
        for(int i=0;i<l-1;i++)
        {
            long count=1;
            while(i<l-1 && nums[i]==nums[i+1])
            {
                count++;
                i++;
            }
            pairs+=((count*(count-1))/2)%1000000007;
        }
        return (int)pairs%1000000007;
    }
}
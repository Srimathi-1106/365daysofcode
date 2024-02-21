// LEETCODE PROBLEM - 2956. Find Common Elements Between Two Arrays

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        byte fre[]=new byte[101];
        int count1=0,count2=0;
        for(int num:nums1)
        {
            fre[num]++;
        }
        for(int num:nums2)
        {
            if(fre[num]!=0)
            count2++;
        }
        Arrays.fill(fre,(byte)0);
        for(int num:nums2)
        {
            fre[num]++;
        }
        for(int num:nums1)
        {
            if(fre[num]!=0)
            count1++;
        }
        return new int[]{count1,count2};
    }
}
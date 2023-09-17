// LEETCODE PROBLEM - 2605. Form Smallest Number From Two Digit Arrays

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min=nums1[0],max=10;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    if(max>nums1[i])
                    max=nums1[i];
                }
            }
        }
        if(max!=10)
        return max;
        for(int i=1;i<nums1.length;i++)
        {
            if(min>nums1[i])
            min=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(max>nums2[i])
            max=nums2[i];
        }
        if(min<max)
        return min*10+max;
        else
        return max*10+min;
    }
}
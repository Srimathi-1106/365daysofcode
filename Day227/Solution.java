// LEETCODE PROBLEM - 2540. Minimum Common Value

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0,len1=nums1.length,len2=nums2.length;
        if(nums1[len1-1]<nums2[0] || nums2[len2-1]<nums1[0])
        return -1;
        while(i<len1 && j<len2)
        {
            if(nums1[i]==nums2[j])
            {
                return nums1[i];
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return -1;
    }
}
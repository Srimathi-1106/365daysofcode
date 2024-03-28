// LEETCODE PROBLEM - 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]=new int[m];
        for(int i=0;i<m;i++)
        {
            temp[i]=nums1[i];
        }
        int i=0,j=0,index=0;
        while(i<m && j<n)
        {
            if(temp[i]<nums2[j])
            {
                nums1[index++]=temp[i++];
            }
            else
            {
                nums1[index++]=nums2[j++];
            }
        }
        while(i<m)
        {
            nums1[index++]=temp[i++];
        }
        while(j<n)
        {
            nums1[index++]=nums2[j++];
        }
    }
}
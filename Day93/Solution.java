// LEETCODE PROBLEM - 349. Intersection of Two Arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> a=new ArrayList<Integer>();
        int b[]=new int[1001];
        for(int i=0;i<nums1.length;i++)
        {
            b[nums1[i]]=1;
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(b[nums2[i]]==1 && !a.contains(nums2[i]))
            {
                a.add(nums2[i]);
            }
        }
        int arr[]=new int[a.size()];
        for(int k=0;k<a.size();k++)
        {
            arr[k]=a.get(k);
        }
        return arr;
    }
}
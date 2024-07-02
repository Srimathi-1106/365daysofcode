// LEETCODE PROBLEM - 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int fre[]=new int[1001];
        int result[]=new int[1001];
        for(int n:nums1)
        {
            fre[n]++;
        }
        int index=0;
        for(int n:nums2)
        {
            if(fre[n]!=0)
            {
                result[index++]=n;
                fre[n]--;
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }
}
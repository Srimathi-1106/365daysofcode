// LEETCODE PROBLEM - 1122. Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int fre[]=new int[1001];
        for(int a:arr1)
        {
            fre[a]++;
        }
        int j=0,index=0;
        while(j<arr2.length)
        {
            while(fre[arr2[j]]!=0)
            {
                arr1[index++]=arr2[j];
                fre[arr2[j]]--;
            }
            j++;
        }
        for(int i=0;i<=1000;i++)
        {
            while(fre[i]!=0)
            {
                arr1[index++]=i;
                fre[i]--;
            }
        }
        return arr1;
    }
}
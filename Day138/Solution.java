// LEETCODE PROBLEM - 1287. Element Appearing More Than 25% In Sorted Array

class Solution {
    public int findSpecialInteger(int[] arr) {
        int c=1;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]==arr[i])
            c++;
            else
            c=1;
            if(c>n/4)
            return arr[i];
        } 
        return arr[0];
    }
}
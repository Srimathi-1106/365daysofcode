// LEETCODE PROBLEM - 1750. Minimum Length of String After Deleting Similar Ends

class Solution {
    public int minimumLength(String s) {
        char arr[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r)
        {
            if(arr[l]!=arr[r])
            break;
            while(l<r && arr[l]==arr[l+1])
            {
                l++;
            }
            while(l<r && arr[r]==arr[r-1])
            {
                r--;
            }
            l++;
            r--;
        }
        if(l>r)
        return 0;
        return r-l+1;
    }
}
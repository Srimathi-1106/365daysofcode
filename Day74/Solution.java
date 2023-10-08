// LEETCODE PROBLEM - 917. Reverse Only Letters

class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r)
        {
            while(l<r && !((a[l]>=65 && a[l]<=90) || (a[l]>=97 && a[l]<=122)))
            {
                l++;
            }
            while(l<r && !((a[r]>=65 && a[r]<=90) || (a[r]>=97 && a[r]<=122)))
            {
                r--;
            }
            char b=a[l];
            a[l]=a[r];
            a[r]=b;
            l++;
            r--;
        }
        return new String(a);
    }
}
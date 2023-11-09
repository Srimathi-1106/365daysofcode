// LEETCODE PROBLEM - 1759. Count Number of Homogenous Substrings

class Solution {
    public int countHomogenous(String s) {
        int i=0,j=0,a=1;
        long c=0;
        while(j<s.length())
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                a=1;
                i=j;
            }
            c+=a++;
            j++;
        }
        return (int)(c%1000000007);
    }
}
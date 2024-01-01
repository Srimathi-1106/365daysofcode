// LEETCODE PROBLEM - 455. Assign Cookies

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gLength=g.length,sLength=s.length;
        for(int i=0,j=0;i<gLength & j<sLength;)
        {
            if(s[j]>=g[i])
            {
                count++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return count;
    }
}
// LEETCODE PROBLEM - 1624. Largest Substring Between Two Equal Characters

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1,n=s.length();
        for(int i=0;i<n;i++)
        {
            max=Math.max(s.lastIndexOf(s.charAt(i))-i-1,max);
        }
        return max;
    }
}
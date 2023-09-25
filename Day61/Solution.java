// LEETCODE PROBLEM - 389. Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0,n=s.length();
        for(int i=0;i<n;i++)
        {
            sum1+=s.charAt(i);
            sum2+=t.charAt(i);
        }
        sum2+=t.charAt(n);
        return (char)(sum2-sum1);
    }
}
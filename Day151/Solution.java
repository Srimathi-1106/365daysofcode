// LEETCODE PROBLEM - 1758. Minimum Changes To Make Alternating Binary String

class Solution {
    public int minOperations(String s) {
        int count1=0,count2=0,n=s.length();
        char start=s.charAt(0);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=start)
            {
                if(i%2==0)
                count1++;
                else
                count2++;
            }
            else
            {
                if(i%2==1)
                count1++;
                else
                count2++;
            }
        }
        return Math.min(count1,count2);
    }
}
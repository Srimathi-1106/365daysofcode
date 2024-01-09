// LEETCODE PROBLEM - 821. Shortest Distance to a Character

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int dist[]=new int[n];
        int k=s.indexOf(c);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==c)
            k=i;
            dist[i]=Math.abs(i-k);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==c)
            k=i;
            dist[i]=Math.min(Math.abs(i-k),dist[i]);
        }
        return dist;
    }
}
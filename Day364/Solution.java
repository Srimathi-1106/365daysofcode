// LEETCODE PROBLEM - 3206. Alternating Groups I

class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0,n=colors.length;
        for(int i=0;i<n;i++)
        {
           if((colors[i]==0 && colors[(i+1)%n]==1 && colors[(i+2)%n]==0) || (colors[i]==1 && colors[(i+1)%n]==0 && colors[(i+2)%n]==1))
           count++;
        }
        return count;
    }
}
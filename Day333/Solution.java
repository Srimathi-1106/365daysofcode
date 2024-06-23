// LEETCODE PROBLEM - 3168. Minimum Number of Chairs in a Waiting Room

class Solution {
    public int minimumChairs(String s) {
        int count=0,max=0;
        for(char c:s.toCharArray())
        {
            if(c=='E')
            count++;
            else
            count--;
            if(max<count)
            max=count;
        }
        return max;
    }
}
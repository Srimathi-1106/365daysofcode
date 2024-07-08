// LEETCODE PROBLEM - 1823. Find the Winner of the Circular Game

class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList<>();
        int st=-1;
        for(int i=1;i<=n;i++)
        list.add(i);
        for(int i=0;i<n-1;i++)
        {
            st+=k;
            if(st>=list.size())
            st=st%list.size();
            list.remove(st);
            st--;
        }
        return list.get(0);
    }
}
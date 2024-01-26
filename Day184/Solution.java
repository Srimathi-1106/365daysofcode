// LEETCODE PROBLEM - 593. Valid Square

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> dist=new HashSet<>();
        dist.add(dist(p1,p2));
        dist.add(dist(p1,p3));
        dist.add(dist(p4,p1));
        dist.add(dist(p2,p3));
        dist.add(dist(p2,p4));
        dist.add(dist(p3,p4));
        return !dist.contains(0) && dist.size()==2;
    }
    static int dist(int[] p1,int[] p2)
    {
        return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
}
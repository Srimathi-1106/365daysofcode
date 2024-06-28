// LEETCODE PROBLEM - 2285. Maximum Total Importance of Roads

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long edges[]=new long[n];
        for(int[] road:roads)
        {
            edges[road[0]]++;
            edges[road[1]]++;
        }
        Arrays.sort(edges);
        int cost=1;
        long total_importance=0;
        for(long edge:edges)
        {
            total_importance+=edge*cost;
            cost++;
        }
        return total_importance;
    }
}
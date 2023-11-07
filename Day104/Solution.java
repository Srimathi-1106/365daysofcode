// LEETCODE PROBLEM - 1921. Eliminate Maximum Number of Monsters

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int i;
        float time[]=new float[dist.length];
        for(i=0;i<dist.length;i++)
        {
            time[i]=dist[i]/(float)speed[i];
        }
        Arrays.sort(time);
        for(i=0;i<dist.length;i++)
        {
            if(time[i]-i<=0)
            break;
        }
        return i;
    }
}
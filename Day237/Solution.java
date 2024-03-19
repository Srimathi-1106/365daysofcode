// LEETCODE PROBLEM - 621. Task Scheduler

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int task_count[]=new int[26];
        int max=0,maxfreq=0;
        for(char task:tasks)
        {
            task_count[task-65]++;
        }
        for(int task:task_count)
        {
            if(task>max)
            {
                max=task;
                maxfreq=1;
            }
            else if(max==task)
            {
                maxfreq++;
            }
        }
        return Math.max(((n+1)*(max-1))+(maxfreq),tasks.length); //formula
    }
}
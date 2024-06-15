// LEETCODE PROBLEM - 502. IPO

class Solution {
    private static class Project{
        int profit,capital;
        Project(int p,int c)
        {
            profit=p;
            capital=c;
        }
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        List<Project> projects=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            projects.add(new Project(profits[i],capital[i]));
        }
        Collections.sort(projects,(a,b) -> a.capital - b.capital);
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
        int index=0;
        for(int i=0;i<k;i++)
        {
            while(index<n && projects.get(index).capital<=w)
            {
                maxHeap.add(projects.get(index).profit);
                index++;
            }

            if(maxHeap.isEmpty())
            break;

            w+= maxHeap.poll();
        }
        return w;
    }
}
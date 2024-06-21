// LEETCODE PROBLEM - 826. Most Profit Assigning Work

class Solution {
    private class Pay{
        int d,p;
        Pay(int d,int p)
        {
            this.d=d;
            this.p=p;
        }
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        Pay pay[]=new Pay[n];
        int maxProfit=0;
        for(int i=0;i<n;i++)
        {
            pay[i]=new Pay(difficulty[i],profit[i]);
        }
        Arrays.sort(pay,(a,b)-> a.d-b.d);
        Arrays.sort(worker);
        int i=0,max=0;
        for(int work:worker)
        {
            while(i<n && work>=pay[i].d)
            {
                max=Math.max(pay[i].p,max);
                i++;
            }
            maxProfit+=max;
        }
        return maxProfit;
    }
}
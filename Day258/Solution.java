// LEETCODE PROBLEM - 2073. Time Needed to Buy Tickets

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        for(int i=0;i<tickets.length;i++)
        {
            if(i==k)
            count+=tickets[i];
            else if(i>k)
            {
                if(tickets[i]<tickets[k])
                count+=tickets[i];
                else
                count+=tickets[k]-1;
            }
            else
            {
                if(tickets[i]<tickets[k])
                count+=tickets[i];
                else
                count+=tickets[k];
            }
        }
        return count;
    }
}
// LEETCODE PROBLEM - 1716. Calculate Money in Leetcode Bank

class Solution {
    public int totalMoney(int n) {
        int money=0,start=1;
        if(n<=7)
        return (n*(n+1))/2;
        while(n>0)
        {
          for(int i=start;i<7+start && n>0;i++)
          {
              money+=i;
              n--;
          }
          start+=1;
        }
        return money;
    }
}
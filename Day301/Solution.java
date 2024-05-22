// LEETCODE PROBLEM - 2739. Total Distance Traveled

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int total=0;
        while(mainTank>0)
        {
            if(mainTank>=5)
            {
                mainTank-=5;
                total+=50;
                if(additionalTank>=1)
                {
                    additionalTank-=1;
                    mainTank+=1;
                }
            }
            else
            {
                total+=mainTank*10;
                mainTank=0;
            }
        }
        return total;
    }
}
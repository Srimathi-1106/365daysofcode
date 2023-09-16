// LEETCODE PROBLEM - 2660. Determine the Winner of a Bowling Game

class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int c=-3,s1=0,s2=0;
        for(int i=0;i<player1.length;i++)
        {
            if(c+2>=i)
                s1+=2*player1[i];
            else 
                s1+=player1[i];
            if(player1[i]==10)
                c=i;
        }
        c=-3;
        for(int i=0;i<player2.length;i++)
        {
            if(c+2>=i)
            s2+=2*player2[i];
            else 
            s2+=player2[i];
            if(player2[i]==10)
            c=i;
        }
        
        return s1>s2?1:(s1<s2?2:0);
    }
}
// LEETCODE PROBLEM - 3222. Find the Winning Player in Coin Game

class Solution {
    public String losingPlayer(int x, int y) {
        boolean winAlice=false;
        while(x>=1 && y>=4)
        { 
            winAlice= winAlice?false:true;
            x--;
            y-=4;
        }
        if(winAlice)
        return "Alice";
        return "Bob";
    }
}
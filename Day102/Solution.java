// LEETCODE PROBLEM - 1535. Find the Winner of an Array Game

class Solution {
    public int getWinner(int[] arr, int k) {
        int winner=arr[0];
        int wc=0;
        for(int i=1;i<arr.length;i++)
        {
            if(winner<arr[i])
            {
                winner=arr[i];
                wc=0;
            }
            if(++wc==k)
            break;
        }
        return winner;
    }
}
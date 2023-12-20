// LEETCODE PROBLEM - 453. Minimum Moves to Equal Array Elements

class Solution {
    public int minMoves(int[] nums) {
        int moves=0,min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            if(min>num)
            {
                min=num;
            }
        }
        for(int num:nums)
        {
            moves+=num-min;
        }
        return moves;
    }
}
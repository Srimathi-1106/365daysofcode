// LEETCODE PROBLEM - 462. Minimum Moves to Equal Array Elements II

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves=0,start=0,end=nums.length-1;
        while(start<end)
        {
            moves+=nums[end]-nums[start];
            start++;
            end--;
        }
        return moves; 
    }
}
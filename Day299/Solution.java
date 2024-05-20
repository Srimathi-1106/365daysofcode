// LEETCODE PROBLEM - 1863. Sum of All Subset XOR Totals

class Solution {
    public int dfs(int i,int xor,int nums[]){
        if(i==nums.length)
        return xor;
        int include=dfs(i+1,xor^nums[i],nums);
        int exclude=dfs(i+1,xor,nums);
        return include+exclude;
    }
    public int subsetXORSum(int[] nums) {
        return dfs(0,0,nums);
    }
}
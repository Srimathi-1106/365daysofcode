// LEETCODE PROBLEM - 78. Subsets

class Solution {
    static List<List<Integer>> subsets;
    public void rec(int i,int nums[],List<Integer> current)
    {
        if(i==nums.length)
        {
            subsets.add(new ArrayList<>(current));
            return;
        }
        rec(i+1,nums,current);
        current.add(nums[i]);
        rec(i+1,nums,current);
        current.remove(current.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        subsets=new ArrayList<>();
        rec(0,nums,new ArrayList<Integer>());
        return subsets;
    }
}
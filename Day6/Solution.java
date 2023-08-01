//LEETCODE PROBLEM - 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> l=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(l.contains(nums[i]))
            {
                return true;
            }
            l.add(nums[i]);
        }
        return false;
    }
}
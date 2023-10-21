// LEETCODE PROBLEM - 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<Integer>();
        for(int n:nums)
        {
            if(a.contains(n))
            return true;
            a.add(n);
        }
        return false;
    }
}
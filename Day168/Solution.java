// LEETCODE PROBLEM - 442. Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean count[]=new boolean[nums.length+1]; 
        List<Integer> duplicates=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(count[nums[i]])
            {
                duplicates.add(nums[i]);
            }
            count[nums[i]]=true;
        }
        return duplicates;
    }
}
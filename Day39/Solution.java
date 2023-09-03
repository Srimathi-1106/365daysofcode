// LEETCODE PROBLEM - 2089. Find Target Indices After Sorting Array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            l.add(i);
            if(nums[i]>target)
            break;
        }
        return l;
    }
}
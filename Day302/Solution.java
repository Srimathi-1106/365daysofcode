// LEETCODE PROBLEM - 2553. Separate the Digits in an Array

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result=new ArrayList<>();
        
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            String str=nums[i]+"";
            for(int j=0;j<str.length();j++)
            {
                result.add(Integer.parseInt(str.charAt(j)+""));
                index++;
            }
        }
        int ans[]=new int[index];
        for(int i=0;i<result.size();i++)
        {
            ans[i]=result.get(i);
        }
        return ans;
    }
}
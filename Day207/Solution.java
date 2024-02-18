// LEETCODE PROBLEM - 2899. Last Visited Integers

class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> seen=new ArrayList<>();
        int k=0,n;
        for(int num:nums)
        {
            if(num!=-1)
            {
                seen.add(num);
                k=0;
            }
            else
            {
                k++;
                n=seen.size();
                if(n>=k)
                {
                    ans.add(seen.get(n-k));
                }
                else
                {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
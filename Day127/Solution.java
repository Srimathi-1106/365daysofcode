// LEETCODE PROBLEM - 46. Permutations

class Solution {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    void per(int nums[],int l)
    {
        if(l==nums.length)
        {
            List<Integer> a=new ArrayList<Integer>();
            for(int num:nums)
            a.add(num);
            res.add(a);
            return ;
        }
        for(int i=l;i<=nums.length-1;i++)
        {
            int t=nums[i];
            nums[i]=nums[l];
            nums[l]=t;
            per(nums,l+1);
            nums[l]=nums[i];
            nums[i]=t;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        per(nums,0);
        return res;
    }
}
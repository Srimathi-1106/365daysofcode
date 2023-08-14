//LEETCODE PROBLEM - 215. Kth Largest Element in an Array

class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        for(int n:nums)
        {
            l.add(n);
        }
        return quickSelect(l,k);
    }
    public int quickSelect(List<Integer> l,int k)
    {
        int p=l.get(new Random().nextInt(l.size()));
        List<Integer> left=new ArrayList<>();
        List<Integer> mid=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int n:l)
        {
            if(n>p)
                left.add(n);
            else if(n<p)
                right.add(n);
            else
                mid.add(n);
        }
        if(k<=left.size())
            return quickSelect(left,k);
        if(left.size() + mid.size() < k)
            return quickSelect(right,k-left.size()-mid.size());
        return p;
    }
}
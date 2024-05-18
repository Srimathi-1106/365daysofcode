// LEETCODE PROBLEM - 2848. Points That Intersect With Cars

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int count=0;
        int fre[]=new int[101];
        for(List<Integer> num:nums){
            int end=num.get(1);
            for(int i=num.get(0);i<=end;i++)
            {
                if(fre[i]==0)
                {
                    fre[i]=1;
                    count++;
                }
            }
        }
        return count;
    }
}
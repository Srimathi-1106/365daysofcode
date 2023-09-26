// LEETCODE PROBLEM - 2859. Sum of Values at Indices With K Set Bits

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s,c=0;
        for(int i=0;i<nums.size();i++)
        {
            s=0;
            int n=i;
            while(n>0)
            {
                if(n%2==1)
                {
                    s++;
                }
                n/=2;
            }
            if(s==k)
            {
                c+=nums.get(i);
                System.out.print(nums.get(i)+" ");
            }
        }
        return c;
    }
}
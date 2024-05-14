// LEETCODE PROBLEM - 2855. Minimum Right Shifts to Sort the Array

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int f1=0,f2=0,index=-1;
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums.get(i)<nums.get(i+1))
            {
                f1++;
            }
            else if(nums.get(i)>nums.get(i+1))
            {
                f2++;
                index=i;
            }
        }
        if(nums.get(nums.size()-1)>nums.get(0))
        f2++;
        if(f1==nums.size()-2 && f2==1)
        {
            return nums.size()-index-1;
        }
        else if(index==-1)
        {
            return 0;
        }
        else
        return -1;
    }
}
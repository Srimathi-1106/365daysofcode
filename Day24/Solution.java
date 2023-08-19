class Solution {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0,j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max1<nums[i])
            {
                max1=nums[i];
                j=i;
            }
        }
        nums[j]=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max2<nums[i])
            max2=nums[i];
        }
        return (max1-1)*(max2-1);
    }
}
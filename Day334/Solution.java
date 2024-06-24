// LEETCCODE PROBLEM - 995. Minimum Number of K Consecutive Bit Flips

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int flip_count=0,current_flips=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>=k && nums[i-k]==2)
            {
                current_flips--;
            }
            if(current_flips%2==nums[i])
            {
                if(i+k > nums.length)
                return -1;
                nums[i]=2;
                current_flips++;
                flip_count++;
            }
        }
        return flip_count;
    }
}
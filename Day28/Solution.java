//LEETCODE PROBLEM- 167. Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] n, int t) {
        int l=0,r=n.length-1;
        while(l<r)
        {
            if(n[l]+n[r]>t)
            {
                r--;
            }
            else if(n[l]+n[r]==t)
            {
                break;
            }
            else
            {
                l++;
            }
        }
        return new int[] {l+1,r+1};
    }
}


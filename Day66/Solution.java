// LEETCODE PROBLEM - 169. Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int e=0,c=0;
        for(int x:nums){
            if(c==0) 
            e=x;
            if(e==x) 
            c++;
            else 
            c--;
        }
        return e;
    }
}
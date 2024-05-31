// LEETCODE PROBLEM - Single Number III

class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n=0;
        for(int key:map.keySet())
        {
            if(map.get(key)==1)
            n++;
        }
        int result[]=new int[n];
        int i=0;
        for(int key:map.keySet())
        {
            if((map.get(key))==1)
            {
                result[i]=key;
                i++;
            }
        }
        return result;
    }
}
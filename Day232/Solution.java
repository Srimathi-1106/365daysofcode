// LEETCODE PROBLEM - 930. Binary Subarrays With Sum

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int currentSum=0,totalCount=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            currentSum+=num;
            if(currentSum==goal)
            totalCount++;
            if(map.containsKey(currentSum-goal))
            totalCount+=map.get(currentSum-goal);
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
            
        }
        return totalCount;
    }
}

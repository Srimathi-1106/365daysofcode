// LEETCODE PROBLEM - 2610. Convert an Array Into a 2D Array With Conditions

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> twoDMatrix = new ArrayList<>();
        int freq[]=new int[nums.length+1];
        for(int num:nums)
        {
            if(freq[num]>=twoDMatrix.size())
            {
                twoDMatrix.add(new ArrayList<>());
            }
            twoDMatrix.get(freq[num]).add(num);
            freq[num]++;
        }
        return twoDMatrix;
    }
}
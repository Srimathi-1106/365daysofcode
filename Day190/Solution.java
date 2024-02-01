// LEETCODE PROBLEM - 2966. Divide Array Into Arrays With Max Difference

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        if(n%3!=0){
            return new int[][]{};
        }
        Arrays.sort(nums);
        int rowIndex=0;
        int result[][]=new int[n/3][3];
        for(int i=0;i<n;i+=3)
        {
            result[rowIndex][0]=nums[i];
            result[rowIndex][1]=nums[i+1];
            result[rowIndex][2]=nums[i+2];
            if(result[rowIndex][2]-result[rowIndex][0]>k)
            {
                return new int[][]{};
            }
            rowIndex++;
        }
        return result;
    }
}
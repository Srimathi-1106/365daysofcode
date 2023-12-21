// LEETCODE PROBLEM - 1637. Widest Vertical Area Between Two Points Containing No Points

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length;
        int arr[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = n-1; i >=1; i--)
        {
            if(ans<arr[i]-arr[i - 1])
            {
                ans=arr[i]-arr[i - 1];
            }
        }
        return ans;
    }
}
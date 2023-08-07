//LEETCODE PROBLEM- 1753. Maximum Score From Removing Stones

class Solution {
    public int maximumScore(int a, int b, int c) {
        int max=(a>=b && a>=c)?a:(b>=c&&b>=a)?b:c;
        int min=(a<=b && a<=c)?a:(b<=c&&b<=a)?b:c;
        int mid=a+b+c-min-max;
         
         if(mid+min>max)
         {
             return max+(min+mid-max)/2;
         }
         else
         return min+mid;
    }
}
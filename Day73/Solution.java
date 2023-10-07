// LEETCODE PROBLEM - 605. Can Place Flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
        return true;
        
        if(flowerbed.length==1 && n==1 && flowerbed[0]==0)
        return true;

        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
            if(i==0 && flowerbed[i+1]==0)
            {
                n--;
                i++;
            }
            else if(i==flowerbed.length-1 && flowerbed[i-1]==0)
            {
                n--;
            }
            else if(i!=0 && i!=flowerbed.length-1 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1)
            {
                n--;
                i++;
            }
            }
            if(n==0)
            return true;
        }
        
        return false;
    }
}
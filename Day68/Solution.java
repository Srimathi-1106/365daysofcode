// LEETCODE PROBLEM - 2038. Remove Colored Pieces if Both Neighbors are the Same Color

class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0;
        int b=0;
        for(int i=0;i<colors.length()-2;i++)
        {
            if(colors.charAt(i)=='A')
            {
                if(colors.charAt(i+1)=='A')
                {
                    if(colors.charAt(i+2)=='A')
                        a++;
                    else
                        i+=1;
                }
            }
            else
            {
                if(colors.charAt(i+1)=='B')
                {
                    if(colors.charAt(i+2)=='B')
                        b++;
                    else
                        i+=1;
                }
            }
        }
        if(a>b)
        return true;
        else
        return false;
    }
}
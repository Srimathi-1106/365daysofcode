// LEETCODE PROBLEM - 1704. Determine if String Halves Are Alike

class Solution {
    public boolean halvesAreAlike(String s) {
        short fre=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0)
            {
                if(i<n/2)
                {
                    fre++;
                }
                else
                {
                    fre--;
                }
            }
        }
        if(fre==0)
        return true;
        return false;
    }
}
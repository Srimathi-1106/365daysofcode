// LEETCODE PROBLEM - 1544. Make The String Great

class Solution {
    public String makeGood(String s) {
        StringBuilder result=new StringBuilder(s);
        int i=0;
        while(i<result.length()-1)
        {
            if(Math.abs(result.charAt(i)-result.charAt(i+1))==32)
            {
                result.delete(i,i+2);
                i--;
                if(i<0)
                i=0;
            }
            else
            {
                i++;
            }
        }
        return result.toString();
    }
}
// LEETCODE PROBLEM - 2678. Number of Senior Citizens

class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
            if((details[i].charAt(11)>54) || (details[i].charAt(11)==54 && details[i].charAt(12)>48))
            c++;
        }
        return c;
    }
}
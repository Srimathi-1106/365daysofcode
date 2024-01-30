// LEETCODE PROBLEM - 2264. Largest 3-Same-Digit Number in String

class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        for(int i=1;i<num.length()-1;i++)
        {
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1))
            {
                if(num.substring(i-1,i+2).compareTo(res)>0)
                    res=num.substring(i-1,i+2);
            }
        }
        return res;
    }
}
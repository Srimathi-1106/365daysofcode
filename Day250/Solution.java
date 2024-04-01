// LEETCODE PROBLEM - 3099. Harshad Number

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumOfDigits=0;
        int dup_x=x;
        while(dup_x>0)
        {
            sumOfDigits+=dup_x%10;
            dup_x/=10;
        }
        if(x%sumOfDigits==0)
        return sumOfDigits;
        return -1;
    }
}
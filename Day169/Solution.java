// LEETCODE PROBLEM - 171. Excel Sheet Column Number

class Solution {
    public int titleToNumber(String columnTitle) {
        int columnNumber=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            columnNumber=columnNumber*26+columnTitle.charAt(i)-64;
        }
        return columnNumber;
    }
}
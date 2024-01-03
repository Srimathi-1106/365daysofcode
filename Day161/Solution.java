// LEETCODE PROBLEM - 2125. Number of Laser Beams in a Bank

class Solution {
    public int numberOfBeams(String[] banks) {
        int totalBeams=0,prevRow=0,currRow,n;
        for(String bank:banks)
        {
            currRow=0;
            for(char cell:bank.toCharArray())
            {
                currRow+=cell-'0';
            }
            if(currRow>0)
            {
                totalBeams+=prevRow*currRow;
                prevRow=currRow;
            }
        }
        return totalBeams;
    }
}
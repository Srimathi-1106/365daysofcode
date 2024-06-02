// LEETCODE PROBLEM - 1812. Determine Color of a Chessboard Square

class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(((coordinates.charAt(0)-98)+(coordinates.charAt(1)-48))%2==0)
        return false;
        return true;
    }
}
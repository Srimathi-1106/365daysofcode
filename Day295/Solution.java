// LEETCODE PROBLEM - 3146. Permutation Difference between Two Strings

class Solution {
    public int findPermutationDifference(String s, String t) {
        int total=0;
        for(int i=0;i<s.length();i++)
        {
            total+=Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return total;
    }
}
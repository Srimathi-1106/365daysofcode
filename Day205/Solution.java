// LEETCODE PROBLEM - 3019. Number of Changing Keys

class Solution {
    public int countKeyChanges(String s) {
        int countOfChanges=0;
        char character1,character2;
        for(int i=1;i<s.length();i++)
        {
            character1=s.charAt(i-1);
            character2=s.charAt(i);
            if(character1!=(char)(character2+32) && character1!=(char)(character2-32) && character1!=character2)
            {
                countOfChanges++;
            }
        }
        return countOfChanges;
    }
}
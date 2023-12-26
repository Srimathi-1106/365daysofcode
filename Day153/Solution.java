// LEETCODE PROBLEM - 387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        int minIndex=-1,index;
        for(char i='a';i<='z';i++)
        {
            index=s.indexOf(i);
            if(index!=-1 && index==s.lastIndexOf(i) && (index<minIndex || minIndex==-1))
                minIndex=index;
        }
        return minIndex;
    }
}
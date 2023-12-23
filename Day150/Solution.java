// LEETCODE PROBLEM - 1496. Path Crossing

class Solution {
    public boolean isPathCrossing(String path) {
        int i=0,j=0;
        Set<String> set=new HashSet<>();
        set.add("0 0");
        for(char ch:path.toCharArray())
        {
            if(ch=='N')
            {
                j++;
            }
            else if(ch=='S')
            {
                j--;
            }
            else if(ch=='E')
            {
                i++;
            }
            else
            {
                i--;
            }
            if(set.contains(i+" "+j))
                return true;
            set.add(i+" "+j);
        }
        return false;
    }
}
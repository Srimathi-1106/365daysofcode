// LEETCODE PROBLEM - 2418. Sort the People

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int k;
        String s;
        for(int i=0;i<names.length;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {
                if(heights[i]<heights[j])
                {
                    k=heights[i];
                    heights[i]=heights[j];
                    heights[j]=k;
                    s=names[i];
                    names[i]=names[j];
                    names[j]=s;
                }
            }
        }
        return names;
    }
}
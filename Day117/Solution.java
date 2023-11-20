// LEETCODE PROBLEM - 2391. Minimum Amount of Time to Collect Garbage

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int total=0;
        String str[]={"G","M","P"};
        for(int i=0;i<garbage.length;i++)
        {
            total+=garbage[i].length();
        }
        for(int i=0;i<travel.length;i++)
        {
            total+=3*travel[i];
        }
        int j;
        for(int i=0;i<str.length;i++)
        {
            j=travel.length-1;
            for(int k=garbage.length-1;k>=1;k--)
            {
                if(garbage[k].contains(str[i]))
                {
                    break;
                }
                total-=travel[j];
                j--;
            }
        }
        return total;
    }
}
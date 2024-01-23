// LEETCODE PROBLEM - 1239. Maximum Length of a Concatenated String with Unique Characters

class Solution {
    public int maxLength(List<String> arr) {
        return findingUniqueStrings(arr,0,"");
    }
    public static int findingUniqueStrings(List<String> arr,int index,String s)
    {
        if(index==arr.size())
        return s.length();
        int taken=s.length();
        if(canMerge(arr.get(index),s))
        {
            taken=findingUniqueStrings(arr,index+1,s+arr.get(index));
        }
        int notTaken=findingUniqueStrings(arr,index+1,s);
        return Math.max(taken,notTaken);

    }
    public static boolean canMerge(String str,String s)
    {
        int fre[]=new int[26];
        for(char c:str.toCharArray())
        {
            if(fre[c-97]==1)
            return false;
            fre[c-97]++;
        }
        for(char c:s.toCharArray())
        {
            if(fre[c-97]==1 || fre[c-97]==-1)
            return false;
            fre[c-97]--;
        }
        return true;
    }
}
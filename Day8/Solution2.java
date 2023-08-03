//LEETCODE PROBLEM- 2405. Optimal Partition of String

class Solution {
    public int partitionString(String s) {
    int c[]=new int[27];
    char a;
    for(int i=0;i<26;i++)
        c[i]=0;
    for(int i=0;i<s.length();i++)
    {
        a=s.charAt(i);
        c[a-97]++;
        if(c[a-97]>1)
        {
            c[26]++;
            for(int j=0;j<26;j++)
            {
                if(c[j]!=0)
                c[j]=0;
            }
            c[a-97]=1;
        }
    }
    return c[26]+1;
    }
}
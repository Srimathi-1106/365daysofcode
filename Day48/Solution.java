//LEETCODE PROBLEM - 1647. Minimum Deletions to Make Character Frequencies Unique

class Solution {
    public int minDeletions(String s) {
        int c=0;
        int fre[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            fre[s.charAt(i)-'a']++;
        }
        Set<Integer> a=new HashSet();
        for(int i=25;i>=0;i--)
        {
            int j=i-1;
            while(fre[i]>0 && a.contains(fre[i]))
            {
                c++;
                fre[i]--;
            }
            a.add(fre[i]);
        }
        return c;
    }
}
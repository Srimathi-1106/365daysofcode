// LEETCODE PROBLEM - 557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=a[i].length()-1;j>=0;j--)
            {
                res.append(a[i].charAt(j));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}
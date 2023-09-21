// LEETCODE PROBLEM - 151.Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        for(int i=0;i<str.length/2;i++)
        {
            String a=str[i];
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=a;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length-1;i++)
        {
            if(!str[i].equals(""))
            sb.append(str[i].strip()+" ");
        }
        sb.append(str[str.length-1]);
        return sb.toString().strip();
    }
}

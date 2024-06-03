// LEETCODE PROBLEM - 2486. Append Characters to String to Make Subsequence

class Solution {
    public int appendCharacters(String s, String t) {
        char s_arr[]=s.toCharArray();
        char t_arr[]=t.toCharArray();
        int t_len=t.length(),s_len=s.length();
        for(int i=0,j=0;i<t_len;i++)
        {
            while(j<s_len && s_arr[j]!=t_arr[i])
            {
                j++;
                
            }
            if(j>=s_len || s_arr[j]!=t_arr[i])
                return t_len-i;
            j++;
        }
        return 0;
    }
}
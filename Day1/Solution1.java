//LEETCODE PROBLEM-2606. Find the Substring With Maximum Cost
//a is the array to represent that the character in s is present in chars or not. if it is present then 1 else 0;
//b is the array to have values of character if it is present in chars

class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int a[]=new int[27];
        int b[]=new int[27];
        int value[]=new int[s.length()];
        for(int i=1;i<=26;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<chars.length();i++)
        {
            a[(int)chars.charAt(i)-96]=1;
            b[(int)chars.charAt(i)-96]=vals[i];
        }
        for(int i=0;i<s.length();i++)
        {
            if(a[(int)s.charAt(i)-96]==1)
            {
                value[i]=b[(int)s.charAt(i)-96];
            }
            else
            {
                value[i]=(int)s.charAt(i)-96;
            }
        }
        int max=0,sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=value[i];
            if(max<sum)
            max=sum;
            if(sum<0)
            sum=0;
        }
        return max;
    }
}
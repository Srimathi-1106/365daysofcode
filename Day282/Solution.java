// LEETCODE PROBLEM - 165. Compare Version Numbers

class Solution {
    public int compareVersion(String version1, String version2) {
        int l1=version1.length(),l2=version2.length(),i=0,j=0;
        while(i<l1 || j<l2)
        {
            StringBuilder s1=new StringBuilder("0");
            StringBuilder s2=new StringBuilder("0");
            while(i<l1 && version1.charAt(i)!='.')
            {
                s1.append(version1.charAt(i));
                i++;
            }
            while(j<version2.length() && version2.charAt(j)!='.')
            {
                s2.append(version2.charAt(j));
                j++;
            }
            if(i<l1)
            i++;
            if(j<l2)
            j++;
            if(Integer.parseInt(s1.toString())>Integer.parseInt(s2.toString()))
            return 1;
            else if(Integer.parseInt(s1.toString())<Integer.parseInt(s2.toString()))
            return -1;
        }
        return 0;
    }
}

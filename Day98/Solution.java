// LEETCODE  PROBLEM - 278. First Bad Version

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,r=n,m;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(isBadVersion(m))
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return l;
    }
}
// LEETCODE PROBLEM - 118. Pascal's Triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        if(numRows==0)
        return a;
        for(int i=1;i<=numRows;i++)
        {
            List<Integer> b=new ArrayList<Integer>();
            if(i==1)
            {
                b.add(1);
            }
            else if(i==2)
            {
                b.add(1);
                b.add(1);
            }
            else
            {
                b.add(1);
                for(int j=1;j<i-1;j++)
                {
                    b.add(a.get(i-2).get(j-1)+a.get(i-2).get(j));
                }
                b.add(1);
            }
            a.add(b);
        }
        return a;
    }
}
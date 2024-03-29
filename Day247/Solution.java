// LEETCODE PROBLEM - 119. Pascal's Triangle II

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int r=0;r<=rowIndex;r++)
        {
            List<Integer> row=new ArrayList<>();
            if(r==0)
            {
                row.add(1);
            }
            else if(r==1)
            {
                row.add(1);
                row.add(1);
            }
            else
            {
                row.add(1);
                for(int i=1;i<r;i++)
                {
                    row.add(pascal.get(r-1).get(i-1)+pascal.get(r-1).get(i));
                }
                row.add(1);
            }
            pascal.add(row);
        }
        return pascal.get(rowIndex);
    }
}
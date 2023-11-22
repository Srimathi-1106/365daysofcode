// LEETCODE PROBLEM - 1424. Diagonal Traverse II

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int c=0;
        List<List<Integer>> row=new ArrayList<>();
        for(int i=0;i<nums.size();i++)
        {
            List<Integer> col=nums.get(i);
            for(int j=0;j<col.size();j++)
            {
                int index=i+j;
                if(row.size()<index+1)
                {
                    row.add(new ArrayList<Integer>());
                }
                row.get(index).add(col.get(j));
                c++;
            }
        }
        int res[]=new int[c];
        int index=0;
        for(List<Integer> list:row)
        {
            for(int i=list.size()-1;i>=0;i--)
            {
                res[index++]=list.get(i);
            }
        }
        return res;
    }
}
// LEETCODE PROBLEM - 1380. Lucky Numbers in a Matrix

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers=new ArrayList<>();
        int rlen=matrix.length,clen=matrix[0].length;
        for(int row=0;row<rlen;row++)
        {
            int min=Integer.MAX_VALUE,c=0;
            boolean isLucky=true;
            for(int col=0;col<clen;col++)
            {
                if(min>matrix[row][col])
                {
                    min=matrix[row][col];
                    c=col;
                }
            }
            for(int tempRow=0;tempRow<rlen;tempRow++)
            {
                if(min<matrix[tempRow][c])
                { 
                    isLucky=false;
                    break;
                }
            }
            if(isLucky)
            luckyNumbers.add(min);
        }
        return luckyNumbers;
    }
}

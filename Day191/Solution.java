// LEETCODE PROBLEM - 1291. Sequential Digits

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<9;i++)
        {
            int number=i;
            int nextDigit=i+1;
            while(nextDigit<=9 && number<=high)
            {
                number=number*10+nextDigit;
                if(number>=low && number<=high)
                {
                    list.add(number);
                }
                nextDigit++;
            }
        }
        Collections.sort(list);
        return list;
    }
}
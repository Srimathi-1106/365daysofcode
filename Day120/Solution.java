// LEETCODE PROBLEM - 1630. Arithmetic Subarrays

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<l.length;i++)
        {
            int arr[]=new int[r[i]-l[i]+1];
            int k=0;
            for(int j=l[i];j<=r[i];j++)
            {
                arr[k]=nums[j];
                k++;
            }
            Arrays.sort(arr);
            int c=0;
            if(k==2)
            {
                c=1;
            }
            for(int j=2;j<k;j++)
            {
                if(arr[1]-arr[0]==arr[j]-arr[j-1])
                {
                    c=1;
                    continue;
                }
                else
                {
                    c=0;
                    break;
                }
            }
            if(c==1)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}
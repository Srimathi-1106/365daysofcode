// LEETCODE PROBLEM - 451. Sort Characters By Frequency

class Solution {
    public String frequencySort(String s) {
        int[] a=new int[128];
        for (int i=0;i<128;i++)
            a[i] = i;
        int[] fre=new int[128];
        for (char c:s.toCharArray()) {
            fre[c]++; 
        }
        int temp;
        for (int i=0;i<128;i++) 
        {
            for (int j=i+1;j<128;j++) 
            {
                if (fre[i]<fre[j] || (fre[i]==fre[j] && a[i]>a[j])) 
                {
                    temp=fre[i];
                    fre[i]=fre[j];
                    fre[j]=temp;
                    
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i=0;i<128;i++) {
            if (fre[i]==0)
                break;
            for (int j=0;j<fre[i];j++) {
                result.append((char)a[i]);
            }
        }
        return result.toString();
    }
}
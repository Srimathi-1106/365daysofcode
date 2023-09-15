//LEETCODE PROBLEM - 1491. Average Salary Excluding the Minimum and Maximum Salary

import java.util.*;
class Solution {
    public double average(int[] salary) {
        int sum=0;
        int max=0;
        int min=10000000;
        for(int i=0;i<salary.length;i++)
        {
            sum+=salary[i];
            if(max<salary[i])
            max=salary[i];
            if(min>salary[i])
            min=salary[i];
        }
        return (double)(sum-max-min)/(salary.length-2);
    }
}
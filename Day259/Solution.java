// LEETCODE PROBLEM - 1700. Number of Students Unable to Eat Lunch

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int stud_circle=0,stud_square=0;
        for(int stud:students)
        {
            if(stud==0)
            stud_circle++;
            else
            stud_square++;
        }
        for(int sandwich:sandwiches)
        {
            if(sandwich==0)
            {
                if(stud_circle>0)
                stud_circle--;
                else
                return stud_square;
            }
            else
            {
                if(stud_square>0)
                stud_square--;
                else
                return stud_circle;
            }
        }
        return 0;
    }
}
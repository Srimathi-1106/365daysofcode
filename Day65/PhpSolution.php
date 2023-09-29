// LEETCODE PROBLEM - 896. Monotonic Array

class Solution {

    /**
     * @param Integer[] $nums
     * @return Boolean
     */
    function isMonotonic($nums) {
        $c=0;
        if($nums[0]<$nums[count($nums)-1])
        {
            for($i=0;$i<count($nums)-1;$i++)
            {
                if($nums[$i]<=$nums[$i+1])
                {
                    $c++;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            for($i=0;$i<count($nums)-1;$i++)
            {
                if($nums[$i]>=$nums[$i+1])
                {
                    $c++;
                }
                else
                {
                    return false;
                }
            }
        }
        if($c==count($nums)-1)
        return true;
        return false;
    }
}
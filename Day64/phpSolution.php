// LEETCODE PROBLEM - 905. Sort Array By Parity

class Solution {

    /**
     * @param Integer[] $nums
     * @return Integer[]
     */
    function sortArrayByParity($nums) {
        $e=array();
        foreach($nums as $i)
        {
            if($i%2==0)
            {
                array_push($e,$i);
            }
        }
        foreach($nums as $i)
        {
            if($i%2==1)
            {
                array_push($e,$i);
            }
        }
        return $e;
    }
}
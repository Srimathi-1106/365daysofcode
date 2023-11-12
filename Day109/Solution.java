// LEETCODE PROBLEM - 1743. Restore the Array From Adjacent Pairs

class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
        for(var pair: adjacentPairs)
        {
            map.putIfAbsent(pair[0],new ArrayList<Integer>());
            map.putIfAbsent(pair[1],new ArrayList<Integer>());

            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        int arr[]=new int[adjacentPairs.length+1];
        for(var k:map.entrySet())
        {
            if(k.getValue().size()==1)
            {
                arr[0]=k.getKey();
                arr[1]=k.getValue().get(0);
                break;
            }
        }
        for(int i=2;i<arr.length;i++)
        {
            var a=map.get(arr[i-1]);
            arr[i]= a.get(0)==arr[i-2]? a.get(1):a.get(0);
        }
        return arr;
    }
}
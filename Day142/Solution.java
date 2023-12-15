// LEETCODE PROBLEM - 1436. Destination City

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> destination=new HashSet<>();
        for(List<String> path:paths)
        {
            destination.add(path.get(0));
        }
        for(List<String> path:paths)
        {
            if(!destination.contains(path.get(1)))
            {
                return path.get(1);
            }
        }
        return "";
    }
}
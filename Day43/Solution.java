//LEETCODE PROBLEM - 1773. Count Items Matching a Rule

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int k,c=0;
        k=ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).get(k).equals(ruleValue))
            c++;
        }
        return c;
    }
}
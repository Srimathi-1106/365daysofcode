// LEETCODE PROBLEM - 290. Word Pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        if(pattern.length()!=str.length)
        return false;
        HashMap<Character,String> map=new HashMap<>();
        for(char i=0;i<pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!str[i].equals(map.get(pattern.charAt(i))))
                return false;
            }
            else
            {
                if(map.containsValue(str[i]))
                return false;
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}
// LEETCODE PROBLEM - 205. Isomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char s_arr[]=s.toCharArray();
        char t_arr[]=t.toCharArray();
        HashMap<Character,Character> map=new HashMap<>();
        Set<Character> val=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s_arr[i]))
            {
                if(val.contains(t_arr[i]))
                return false;
                map.put(s_arr[i],t_arr[i]);
                val.add(t_arr[i]);
            }
            else
            {
                if(map.get(s_arr[i])!=t_arr[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
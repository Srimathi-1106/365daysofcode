// LEETCODE PROBLEM - 49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char fre[]=new char[26];
            for(char c:strs[i].toCharArray())
            {
                fre[c-'a']++;
            }
            String s=new String(fre);
            if(!map.containsKey(s))
            map.put(s,new ArrayList<>());
            map.get(s).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
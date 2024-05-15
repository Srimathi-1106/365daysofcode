// LEETCODE PROBLEM - 2788. Split Strings by Separator

public class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String[] str=words.get(i).split("\\"+separator);
            for(String s : str)
            {
                if(!s.equals(""))    
                result.add(s);
            }
        }
        return result;
    }
}

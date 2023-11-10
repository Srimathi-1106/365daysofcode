// LEETCODE PROBLEM - 500. Keyboard Row

class Solution {
    public String[] findWords(String[] words) {
        String str[]={"qwertyuiop","asdfghjkl","zxcvbnm"};
        ArrayList<String> res=new ArrayList<String>();
        int c;
        for(int i=0;i<words.length;i++)
        {
            c=-1;
            for(int j=0;j<words[i].length();j++)
            {
                String s=Character.toLowerCase(words[i].charAt(j))+"";
                if((c==-1 || c==1) && str[0].contains(s))
                    c=1;
                else if((c==2 || c==-1) && str[1].contains(s))
                    c=2;
                else if((c==3 || c==-1) && str[2].contains(s))
                    c=3;
                else
                {
                    c=-1;
                    break;
                }
            }
            if(c!=-1)
            {
                res.add(words[i]);
            }
        }
        String r[]=new String[res.size()];
        res.toArray(r);
        return r;
    }
}
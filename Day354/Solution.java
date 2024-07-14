// LEETCODE PROBLEM - 726. Number of Atoms

class Solution {
    public String countOfAtoms(String formula) {
        Stack<String> stack=new Stack<>();
        int multiplicity=1,product=1;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=formula.length()-1;i>=0;i--)
        {
            char c=formula.charAt(i);
            if(c==')' )
            {
                if(!stack.isEmpty())
                multiplicity*=Integer.parseInt(stack.peek());
                stack.push(c+"");
            }
            else if (Character.isDigit(c)) {
                int st = i;
                while (i >= 0 && Character.isDigit(formula.charAt(i))) {
                    i--;
                }
                i++;
                stack.push(formula.substring(i,st+1));  
            }
            else if(c=='(')
            {
                stack.pop();
                if(!stack.isEmpty())
                multiplicity/=Integer.parseInt(stack.pop());
            }
            else if(Character.isLowerCase(c))
            {
                String str=formula.substring(i-1,i+1);
                product=1;
                if(!stack.isEmpty() && !stack.peek().equals(")"))
                {
                    product=Integer.parseInt(stack.pop());
                }
                map.put(str,map.getOrDefault(str,0)+multiplicity*product);
                i--;
            }
            else
            {
                product=1;
                if(!stack.isEmpty() && !stack.peek().equals(")") )
                {
                    product=Integer.parseInt(stack.pop());
                }
                map.put(c+"",map.getOrDefault(c+"",0)+multiplicity*product);
            }
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, (a, b) -> a.getKey().compareTo(b.getKey()));

        map = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            map.put(entry.getKey(), entry.getValue());
        }

        StringBuilder res = new StringBuilder();
        for (String str : map.keySet()) {
            res.append(str);
            int count = map.get(str);
            if (count > 1) {
                res.append(count);
            }
        }
        return res.toString();
    }
}
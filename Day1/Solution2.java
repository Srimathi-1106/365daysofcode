//LEETCODE PROBLEM-2785. Sort Vowels in a String

class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        int count[]= new int[10];//count the number of each vowel in the given string
        int position;
        for(int i=0;i<s.length();i++){
            position = vowels.indexOf(s.charAt(i));
            if(position!=-1){
                count[position]++;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        int index = 0;
        for(int i=0;i<s.length();i++){
            if(vowels.contains(s.charAt(i)+"")){
                while(count[index]==0){
                    index++;
                }
                sb.setCharAt(i,vowels.charAt(index));
                count[index]--;
            }
        }
        return sb.toString();
    }
}

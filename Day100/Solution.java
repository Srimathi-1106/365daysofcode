// LEETCODE PROBLEM - 1441. Build an Array With Stack Operations

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<String>();
        int a = 1;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == a) {
                res.add("Push");
            } else {
                while (a < target[i]) {
                    res.add("Push");
                    res.add("Pop");
                    a++;
                }
                res.add("Push");
            }
            a++;
        }
        return res;
    }
}

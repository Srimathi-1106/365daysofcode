// LEETCODE PROBLEM - 380. Insert Delete GetRandom O(1)

class RandomizedSet {
    List<Integer> ran;
    public RandomizedSet() {
        ran=new ArrayList();
    }
    
    public boolean insert(int val) {
        if(!ran.contains(val))
        {
            ran.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        Integer v=val;
        return ran.remove(v);
    }
    
    public int getRandom() {
        Random random=new Random();
        int k=random.nextInt(ran.size());
        return ran.get(k);
    }
}
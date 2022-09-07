class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random rand;

    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        else{
            map.put(val, list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int ind = map.get(val);
        if (ind < list.size() - 1) {
            int end = list.get(list.size() - 1);
            list.set(ind, end);
            map.put(end, ind);
        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i< hand.length; i++){
            if(map.containsKey(hand[i])){
                map.put(hand[i], map.get(hand[i]) + 1);
                if(map.get(hand[i]) > hand.length/groupSize) return false;
            }else{
                map.put(hand[i], 1);
            }
        }

        while(map.size() > 0){
            int min_val = map.firstKey();
            for(int i= min_val; i< min_val + groupSize; i++){
                if(!map.containsKey(i)) return false;
                int count = map.get(i);
                if(count == 1) map.remove(i);
                else
                    map.replace(i, count-1);
            }
        }

        return true;
    }
}
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i< s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        PriorityQueue<Character> pq = new PriorityQueue<Character>((v1, v2) -> map.get(v2) - map.get(v1) - 0);
        for(Character c: map.keySet())
            pq.add(c);
        StringBuilder s1 = new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            int count = map.get(c);
            for(int i = 0; i<count; i++) s1 = s1.append(c);
        }
        return s1.toString();
        
    }
}
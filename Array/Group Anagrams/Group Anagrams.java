class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char chr[] = s.toCharArray();
            Arrays.sort(chr);
            String sorted = new String(chr);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        ans.addAll(map.values());
        return ans;
        
    }
}
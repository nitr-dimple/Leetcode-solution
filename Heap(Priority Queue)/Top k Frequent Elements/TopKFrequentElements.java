class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k) return nums;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i< nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+ 1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((val1, val2) -> map.get(val1) - map.get(val2));
        for(int i : map.keySet()){
            pq.add(i);
            if(pq.size() > k) pq.poll();
        }
        int res[] = new int[k];
        for(int i = 0; i< k; i++)
           res[i] = pq.poll(); 
        return res;
    }   
}
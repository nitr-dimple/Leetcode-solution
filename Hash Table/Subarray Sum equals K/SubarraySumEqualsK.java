class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int prevSum = 0;
        int count = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            prevSum = sum - k;
            if(map.containsKey(prevSum)) count += map.get(prevSum);
            map.put(sum, map.getOrDefault(sum,0) + 1);
        }
        return count;
        
    }
}
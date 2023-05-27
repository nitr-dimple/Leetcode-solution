class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    int size;

    public KthLargest(int k, int[] nums) {
        size = k;
        int i=0;
        for(; i<k && i<nums.length; i++)
            pq.add(nums[i]);

        for(; i< nums.length;i++)
            add(nums[i]);
    }
    
    public int add(int val) {
        if( pq.size() >= size){
            if(pq.peek() < val){
                    pq.remove();
                    pq.add(val);
            }
        }else{
            pq.add(val);;
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
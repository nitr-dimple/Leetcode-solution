class Solution {
    public int partition(int[] nums, int lo, int hi){
        int pivot = nums[lo];
        int i = lo, j = hi+1;
        while(true){
            while(i < hi && nums[++i] > pivot);
            while(j > lo && nums[--j] < pivot);
            if(i >= j) break;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
        }
        int temp = nums[j];
        nums[j] = nums[lo];
        nums[lo] = temp;
        return j;
    }
    
    
    public int findKthLargest(int[] nums, int k) {
        // This approach is using Quick sort algorithm
        int lo = 0, hi = nums.length -1;
        while(lo < hi){
            int j = partition(nums, lo, hi);
            if(j < k-1) lo = j+1;
            else if(j>k-1) hi = j-1;
            else return nums[k-1];
        }
        return nums[k-1];

        // Using Min PriorityQueue
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int i = 0;
        // for(; i< k; i++) pq.add(nums[i]);
        // for(; i< nums.length; i++){
        //     if(pq.peek() < nums[i]){
        //         pq.remove();
        //         pq.add(nums[i]);
        //     }
        // }
        // return pq.peek();
    }
}
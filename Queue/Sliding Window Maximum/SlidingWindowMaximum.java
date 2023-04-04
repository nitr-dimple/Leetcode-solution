class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<Integer>();
        int max[] = new int[nums.length - k + 1];
        int i=0;
        for(; i< k; i++){
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.removeLast();
            deque.addLast(i);
        }
        int j = 0;
        for(; i< nums.length; i++){
            max[j] = nums[deque.peekFirst()];
            while(!deque.isEmpty() && deque.peekFirst() <= i-k)
                deque.removeFirst();
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.removeLast();
            deque.addLast(i);
            j++;
        }
        max[j] = nums[deque.peekFirst()];
        return max;
    }
}
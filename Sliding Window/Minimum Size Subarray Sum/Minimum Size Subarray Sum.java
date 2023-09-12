class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0;
        int prer = -1;
        int min_length = Integer.MAX_VALUE;
        int curr_sum = 0;
        while(r < nums.length && l < nums.length){
            if(prer != r)
                curr_sum += nums[r];
            prer = r;

            if(curr_sum >= target){
                int len = r - l + 1;
                min_length = min_length <  len ? min_length : len;
                curr_sum -= nums[l];
                l++;
            }else{
                r++;
            }

        }
        if(min_length == Integer.MAX_VALUE) return 0;
        return min_length;
        
    }
}
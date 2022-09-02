class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <=0) return 0;
        int count = 0, product = 1;
        int left = 0, right;
        for(right = 0; right < nums.length; right++){
            if(nums[right] < k) count++;
            product = product * nums[right];

            while(left < right && product >= k){
                product /= nums[left];
                left++;
            }
            
            if(product < k) {
                count = count + right - left;
            }
        }
        return count;
    }
}
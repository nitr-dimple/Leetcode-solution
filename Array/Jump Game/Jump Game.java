class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0] - 1;
        for(int i=1; i< nums.length; i++){
            if(max < 0) return false;
            max = (max > nums[i] ? max : nums[i]) - 1;
        }
        return true;
        
    }
}
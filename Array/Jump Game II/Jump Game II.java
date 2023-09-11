class Solution {
    public int jump(int[] nums) {
        int result = 0;
        int left = 0, right = 0;
        // BFS Approach
        while(right < nums.length -1){
            int max = 0;
            for(int i=left; i<=right; i++){
                max = max > i + nums[i] ? max : i + nums[i];
            }
            left = right + 1;
            right = max;
            result++;
        }
        return result;
        
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int count = 0;
        ans[0] = 1;
        for(int i=1; i< nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int prod = 1;
        for(int i = nums.length -2; i>=0; i--){
            prod *= nums[i+1];
            ans[i] = ans[i] * prod;
        }
        // for(int i=0; i< nums.length; i++){
        //     if(nums[i] == 0) count++;
        //     else prod *= nums[i];
        // }

        // if(count == 0){
        //     for(int i=0; i< nums.length; i++){
        //         ans[i] = (int)prod/nums[i];
        //     }
        // }
        // else if(count == 1){
        //     for(int i=0; i< nums.length; i++){
        //         if(nums[i] == 0)
        //             ans[i] = (int)prod;
        //     }
        // }

        return ans;
    }
}
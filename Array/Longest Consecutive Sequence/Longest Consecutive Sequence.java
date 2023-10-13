class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> set = new HashSet<Integer>();
        // for(int i=0; i< nums.length; i++)
        //     set.add(nums[i]);
        // int ans = 0;
        // for(int i = 0; i< nums.length; i++) {
        //     if(!set.contains(nums[i] - 1)){
        //         int j = nums[i];
        //         while(set.contains(j)) j++;
        //         ans = ans < j - nums[i] ? j - nums[i] : ans;
        //     }
        // }
        if(nums.length == 0) return 0;
        else if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int ans = 1, max = 1;
        int prev = nums[0];
        for(int i=1; i<nums.length; i++){
            if(prev == nums[i] -1){
                ans++;
                if(ans > max) max = ans;
            }else if(prev == nums[i]){
                continue;
            }
            else{
                ans = 1;
            }
            prev = nums[i];

        }
        return max;
    }
}
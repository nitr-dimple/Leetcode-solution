class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int i=0, j=1;
        int count = 1;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                count++;
                if(count <= 2){
                    i++;
                    nums[i] = nums[j];
                }
                j++;
            }
            else{
                i++;
                if(i != j){
                    nums[i] = nums[j];
                }
                j++;
                count = 1;
            }
        }
        return i+1;
    }
}
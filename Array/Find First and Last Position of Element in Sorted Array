class Solution {
    public int binarySearch(int[] nums, int low,  int high, int key){
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == key) return mid;
            if(nums[low] == key) return low;
            if(nums[high] == key) return high;
            if(key > nums[mid])
                low = mid + 1;
            if(key < nums[mid])
                high = mid - 1;
        }
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int loc = binarySearch(nums, 0, nums.length - 1, target);
        if(loc == -1)
            return ans;
        else{
            int i=loc;
            while(i >= 0 && nums[i] == target)
                i--;
            ans[0] = i+1;
            i = loc;
            while( i<nums.length && nums[i] == target) i++;
            ans[1] = i-1;
        }
        return ans;
    }
}
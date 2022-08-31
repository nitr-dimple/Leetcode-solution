class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int left_max = 0, right_max =0;
        int high = height.length -1, low = 0;
        while(low <=high){
            if(height[low] < height[high]){
                if(left_max < height[low])
                    left_max = height[low];
                else
                    sum += left_max-height[low];
                low++;
            }
            else {
                if(right_max < height[high])
                    right_max = height[high];
                else
                    sum += right_max - height[high];
                high--;
            }
        }
        return sum;
    }
}
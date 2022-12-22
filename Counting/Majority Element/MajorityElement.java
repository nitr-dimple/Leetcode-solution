class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int key = 0;

        for(int i : nums){
            
            if(count == 0){
                key = i;
            }
            if(key == i){
                count = count + 1;
            }
            else{
                count = count - 1;
            }
        } 
        return key; 
        
    }
}
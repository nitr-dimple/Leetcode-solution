class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans[] = new int[nums1.length];
        
        for(int i = 0; i< nums2.length; i++){
            while(!stk.isEmpty() && stk.peek() < nums2[i]){
                int ind = stk.pop();
                map.put(ind, nums2[i]);
            }
            stk.push(nums2[i]);
        }
        while(!stk.isEmpty()){
            int ind = stk.pop();
            map.put(ind, -1);
        }
        
        for(int i = 0; i< nums1.length; i++)
            ans[i] = map.get(nums1[i]);
        return ans;
    }
}
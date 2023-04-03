class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<Integer>();
        int ans[] = new int[prices.length];
        
        for(int i = 0; i< prices.length; i++){
            while(!stk.isEmpty() && prices[stk.peek()] >= prices[i]){
                int ind = stk.pop();
                ans[ind] = prices[ind] - prices[i];
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int ind = stk.pop();
            ans[ind] = prices[ind];
        }
        return ans;
        
    }
}
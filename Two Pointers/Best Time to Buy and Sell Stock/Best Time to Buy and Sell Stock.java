class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;
        int max = 0;

        if(prices.length <= 1) return max;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                max = prices[right] - prices[left] > max ? prices[right] - prices[left] : max;
            }
            else{
                left = right;
            }
            right = right + 1;
        }
        return max;
        
    }
}
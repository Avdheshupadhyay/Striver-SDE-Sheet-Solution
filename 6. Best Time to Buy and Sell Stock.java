class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min_value){
                min_value = prices[i];
            }
            if (prices[i] - min_value > profit){
                profit = prices[i] - min_value;
            }
        }
        return profit;
    }
}
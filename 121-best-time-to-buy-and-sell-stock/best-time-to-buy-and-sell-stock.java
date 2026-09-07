class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){

            int currentPrice = prices[i];
            int currentProfit = currentPrice - minPrice;
            if(currentPrice<minPrice){
                minPrice = prices[i];
            }

            else if(currentProfit>maxProfit){
                maxProfit = currentPrice-minPrice;

            }
        } 

        return maxProfit;
    }
}
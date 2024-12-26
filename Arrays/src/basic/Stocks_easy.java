package basic;

public class Stocks_easy {
    // using dynamic programming
    public static int maxProfit(int[] prices) {
        if (prices.length < 1){
            return 0;
        }
        int buyStockDay = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = 0;
            if (buyStockDay > prices[i]) buyStockDay = prices[i];

            currentProfit =  prices[i] - buyStockDay ;

            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
        }


    public static void main(String[] args) {
       int ans =  maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(ans);

    }
}

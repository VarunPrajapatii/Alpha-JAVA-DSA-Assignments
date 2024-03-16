package Arrays;

public class BuyAndSellStockProblem {
    public static int buyAndSellStock(int prices[]) {
        int maxProfit =0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i]-buyPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit will be: " + buyAndSellStock(arr));
    }
}

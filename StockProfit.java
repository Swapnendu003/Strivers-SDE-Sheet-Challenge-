import java.util.ArrayList;

public class StockProfit {
    public static int maximumProfit(ArrayList<Integer> prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize the minimum price to a large value
        int maxProfit = 0; // Initialize the maximum profit to 0

        // Iterate over the prices ArrayList
        for (int price : prices) {
            // Update the minimum price if the current price is smaller
            minPrice = Math.min(minPrice, price);

            // Update the maximum profit if selling at the current price gives a higher profit
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(2);
        prices.add(100);
        prices.add(150);
        prices.add(120);

        int maxProfit = maximumProfit(prices);

        System.out.println("Maximum profit: " + maxProfit);
    }
}

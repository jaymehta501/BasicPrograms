package Blind75.Arrays;

public class OptimizedMaxProfitIndices {

    public static void main(String[] args) {
        System.out.println("Max Profit -------- " + maxProfitIndices(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfitIndices(int prices[]) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit = profit + (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}

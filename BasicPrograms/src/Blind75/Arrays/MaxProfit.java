package Blind75.Arrays;

/*
https://www.youtube.com/watch?v=1pkOgXD63yU

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.
        */


public class MaxProfit {

    public static void main(String[] args) {
        System.out.println("Max Profit -------- " + maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println("Max Profit -------- " + maxProfitSlidingWindow(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int prices[]) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        if (prices.length < 2) {
            return 0;
        }

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static int maxProfitSlidingWindow(int prices[]) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        if (prices.length < 2) {
            return 0;
        }

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Integer.max(maxProfit, profit);
            } else {
                left = left + 1;
            }
            right = right + 1;
        }

        return maxProfit;
    }

}


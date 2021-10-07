package Blind75.DynamicProgramming;

/**
https://www.youtube.com/watch?v=-NTaXJ7BBXs
https://leetcode.com/problems/coin-change/

You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.

Example 1:
        Input: coins = [1,2,5], amount = 11
        Output: 3
        Explanation: 11 = 5 + 5 + 1

Example 2:
        Input: coins = [2], amount = 3
        Output: -1

Example 3:
        Input: coins = [1], amount = 0
        Output: 0

Example 4:
        Input: coins = [1], amount = 1
        Output: 1

Example 5:
        Input: coins = [1], amount = 2
        Output: 2
        */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange {

    public static void main(String[] args) {

        System.out.println("Total : 18, Coins - {7, 5, 1}  ----->  Minimum coins needed = " + new CoinChange().minCoinsDP(18, new int[]{7, 5, 1}));
        System.out.println("Total : 11, Coins - {1, 2, 5}  ----->  Minimum coins needed = " + new CoinChange().minCoinsDP(11, new int[]{1, 2, 5}));
        System.out.println("Total : 3, Coins - {2}  ----->  Minimum coins needed = " + new CoinChange().minCoinsDP(3, new int[]{2}));
        System.out.println("Total : 0, Coins - {1}  ----->  Minimum coins needed = " + new CoinChange().minCoinsDP(0, new int[]{1}));
        System.out.println("Total : 1, Coins - {1}  ----->  Minimum coins needed = " + new CoinChange().minCoinsDP(1, new int[]{1}));
        System.out.println("Total : 2, Coins - {1}  ----->  Minimum coins needed = " + new CoinChange().minCoinsDP(2, new int[]{1}));

    }

    public Map<Integer, Integer> map = new HashMap<>();

    public int minCoinsDP(int amount, int[] coins) {

            int min = Integer.MAX_VALUE;
            if(amount == 0)
                return 0;
            if(map.containsKey(amount))
                return map.get(amount);

            int currentResult;
            for(int num : coins){
                if(num <= amount){
                    currentResult = minCoinsDP(amount - num , coins);
                    if(currentResult != -1 ){
                        min = Math.min(currentResult + 1, min);
                    }

                }
            }

            if(min == Integer.MAX_VALUE)
                min = -1;
            map.put(amount, min);
            return min;
    }

    public static int minCoins(int amount, int[] coins) {

        if (amount == 0) {
            return 0;
        }

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int totalMinCoins = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {

            if (amount - coins[i] >= 0) {

                int subAns = 0;

                if (dp[amount - coins[i]] != -1) {
                    subAns = dp[amount - coins[i]];
                } else {
                    subAns = minCoins(amount - coins[i], coins);
                }

                if (subAns != Integer.MAX_VALUE &&
                        subAns + 1 < totalMinCoins) {
                    totalMinCoins = subAns + 1;
                }
            }
        }

        dp[amount] = totalMinCoins;
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}

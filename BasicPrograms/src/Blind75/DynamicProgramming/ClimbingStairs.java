package Blind75.DynamicProgramming;

/*
https://www.youtube.com/watch?v=Y0lT9Fck7qI
https://leetcode.com/problems/climbing-stairs/

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
        Example 2:


Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
        */

public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println("Total top n = 5 -> Total # of ways = " + climbStairs(5));
        System.out.println("Total top n = 3 -> Total # of ways = " + climbStairs(3));
        System.out.println("Total top n = 1 -> Total # of ways = " + climbStairs(1));
        System.out.println("Total top n = 10 -> Total # of ways = " + climbStairs(10));
        System.out.println("Total top n = 15 -> Total # of ways = " + climbStairs(15));
    }

    public static int climbStairs(int n) {
        // base cases
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int one_step_before = 1;
        int two_steps_before = 1;
        int all_ways = 0;

        for (int i = 1; i < n; i++) {
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}

package org.example;
//There exists  staircase with N steps, and you can climb up either 1 or 2
//steps at a time. Given N, write a function that returns the number of unique ways
//you can climb the staircase. The order of steps matter.
//test:  input-4, output-5
public class CountingWays_28_05_2022 {
    public static int CountingWays(int N){
        int[] dp = new int[N];
        //initialize first 2 elements in array dp
        dp[0] = 1;
        dp[1] = 2;
        for (int i=2;i<N;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[N-1];
    }
}

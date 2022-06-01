package org.example;
//Given a list of integers, write a function that returns the largest
//of non-adjacent numbers. Numbers can be 0 or negative. For example
// input-[2,4,6,2,5], output- 13
public class SumofNonAdj26_05_22 {
    public static int sumofnonadj(int[] arr, int n){
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = arr[0];
        for(int i=1;i<n;i++){
            if(arr.length==1){
                return arr[0];
            }
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = dp[i-1][0]+arr[i];
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}
//[[0,2],[2,8]...n[]

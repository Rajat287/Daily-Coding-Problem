package org.example;
/*Given a set of non-negative integers, and a value sum,
determine if there is a subset of the given set with sum equal to given sum.
Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
Output: False
There is no subset that add up to 30.*/
public class SubsetSum_28_06_2022 {

//     static boolean sumPresent(int[] arr, int sum, int N){
//         if(sum == 0){
//             return true;
//         }
//         if(N==0){
//             return false;
//         }
//         if(arr[N-1]>sum){
//             sumPresent(arr,sum,N-1);
//         }
//         return sumPresent(arr,sum,N-1)||sumPresent(arr,sum-arr[N-1],N-1);
//    }
    static boolean sumPresent(int[] arr, int sum, int N){
        boolean[][] dp = new boolean[sum+1][N+1];
        for(int i=0;i<=N;i++){
            dp[0][i] = true;
        }
        for(int i=1;i<=sum;i++){
            dp[i][0] = false;
        }
        for(int i=1;i<=sum;i++){
            for(int j=1;j<=N;j++){
                dp[i][j] = dp[i][j-1];
                if(i>=arr[j-1]){
                    dp[i][j] = dp[i][j]||dp[i-arr[j-1]][j-1];
                }
            }
        }
        return dp[sum][N];
    }

    public static void main(String[] args) {
        int[] given = {8,1,61,5,6,1};
        System.out.println(sumPresent(given,10,6));
    }
}

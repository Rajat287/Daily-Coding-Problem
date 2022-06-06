package org.example;

//import java.util.ArrayList;
import java.util.Arrays;


public class MinimalCost05_06_2022 {
    //Brute Force O(n*k)

    int[] MinimumPaintCost(int[] arr,int k){
        int[] ans = new int[arr.length-k+1];
        for(int i=0;i<=arr.length-k;i++){
            int max = 0;
            for(int j=i;j<k+i;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}

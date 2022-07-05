package org.example;
/*Problem:
Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137,
since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take
any elements.
Do this in O(N) time.*/
public class MaxCountSum_05_07_2022 {
    static int maxSum(int[] arr, int n){
        int max_so_far = arr[0];
        int curr_max = arr[0];

        for(int i=1;i<n;i++){
            curr_max = Math.max(arr[i],curr_max+arr[i]);
            max_so_far = Math.max(curr_max,max_so_far);
        }
        //if only negative elements are there return 0.
        if(max_so_far<0){
            return 0;
        }
        return max_so_far;
    }
}

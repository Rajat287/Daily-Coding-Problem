package org.example;

import java.util.Arrays;

public class InversionsInArr_30_06_2022 {

    static int countInversions(int[] arr, int l,int r,int m){

        int[] left = Arrays.copyOfRange(arr,l,m+1);

        int[] right = Arrays.copyOfRange(arr,m+1,r+1);

        int i=0,j=0,k=l,swaps=0;
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                arr[k++] = left[i++];

            }else{
                arr[k++] = right[j++];

                swaps += (m+1)-(l+i);
            }
        }
        while(i<left.length){
            arr[k++] = left[i++];
        }
        while(j<right.length){
            arr[k++] = right[j++];
        }
        return swaps;
    }
    static int mergeAndCount(int[] arr,int l,int r){
        int count =0;
        if (l<r){
            int m = (l+r)/2;
            //left subarray
            count += mergeAndCount(arr,l,m);
            //right subarray
            count += mergeAndCount(arr,m+1,r);
            //count swaps
            count += countInversions(arr,l,r,m);
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 20, 6, 4, 5 };

        System.out.println(
                mergeAndCount(arr, 0, arr.length - 1));
    }
}

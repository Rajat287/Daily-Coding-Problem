package org.example;
//Given a list of numbers and a number k, return whether any two
//numbers from the list add upto k.
//input - [10,15,3,7], k - 17, output- true
public class SumofPair_17_05_22 {
    public static boolean sumofpair(int[] arr,int k) {
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==k){
                return true;
            }
            if(arr[l]+arr[r]>k){
                r = r-1;
            }
            if(arr[l]+arr[r]<k){
                l = l+1;
            }
        }
        return false;
    }
}

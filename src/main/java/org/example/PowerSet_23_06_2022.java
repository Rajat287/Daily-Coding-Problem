package org.example;

public class PowerSet_23_06_2022 {
    static void powerSet(int[] arr, int n){
        long indexes = (long) Math.pow(2,n);
        for(int counter=0;counter<indexes;counter++){
            for(int i=0;i<n;i++){
                if((counter & (1<<i))>0){
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] given = {1,2,3};
        powerSet(given,3);
    }
}

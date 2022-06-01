//Given a Stream of elements too large to store in memory, pick a random element from the stream
//        with from the stream with uniform probability.
package org.example;
import java.util.Random;
public class RandomInteger {
    int ans,count=0;
    int Selectrandom_01_06_2022(int[] arr){
        Random r = new Random();
        ans = r.nextInt(arr.length);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        RandomInteger rr = new RandomInteger();
        System.out.println(rr.Selectrandom_01_06_2022(arr));

    }
}

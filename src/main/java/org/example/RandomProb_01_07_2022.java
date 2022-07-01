package org.example;

/*Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability, 
implement a function rand7() that returns an integer from 1 to 7 (inclusive).*/

import java.util.Random;

public class RandomProb_01_07_2022 {
    static int rand5(){
        Random r = new Random();
        int i =r.nextInt(5);
        return i;
    }
    static int rand7(){
        int res = 5*rand5()+rand5();
        while(res>=21){
            return rand7();
        }
        return res%7+1;
    }

    public static void main(String[] args) {
        System.out.println(rand7());
    }
}

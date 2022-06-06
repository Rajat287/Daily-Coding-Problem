package org.example;

//import org.junit.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.SumofPair_17_05_22.sumofpair;

class SumOfPairTest {
    @Test
    void test1() {
        int[] arr = {10, 15, 9, 7};

        Assertions.assertTrue(sumofpair(arr, 17));
    }

}
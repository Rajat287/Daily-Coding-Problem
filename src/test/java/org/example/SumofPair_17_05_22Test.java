package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.example.SumofPair_17_05_22.sumofpair;
import static org.junit.jupiter.api.Assertions.*;

class SumofPair_17_05_22Test {
    @Test
    void test1(){
        int[] arr = {10,15,9,7};

        Assert.assertTrue(sumofpair(arr,17));
    }

}
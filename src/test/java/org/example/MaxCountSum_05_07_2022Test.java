package org.example;

import org.junit.jupiter.api.Test;

import static org.example.MaxCountSum_05_07_2022.maxSum;
import static org.junit.jupiter.api.Assertions.*;

class MaxCountSum_05_07_2022Test {
    @Test
    void test1(){
        int[] arr = {-5,-6,-3,-8};
        assertEquals(0,maxSum(arr,arr.length));
    }
    @Test
    void test2(){
        int[] arr = {34,-50,42,14,-5,86};
        assertEquals(137,maxSum(arr,arr.length));
    }

}
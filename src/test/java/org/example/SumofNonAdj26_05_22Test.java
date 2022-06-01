package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.example.SumofNonAdj26_05_22.*;
class SumofNonAdj26_05_22Test {

    @Test
    void test() {
        int[] arr = {2,4,6,2,5};
        int n = arr.length;
        assertEquals(13,sumofnonadj(arr,n));
    }
    @Test
    void test1() {
        int[] arr = {5,1,1,5};
        int n = arr.length;
        assertEquals(10,sumofnonadj(arr,n));
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import static org.example.CountingWays_28_05_2022.CountingWays;
import static org.junit.jupiter.api.Assertions.*;

class CountingWays_28_05_2022Test {
    @Test
    void test1(){
        int N = 4;
        assertEquals(5,CountingWays(N));
    }

}
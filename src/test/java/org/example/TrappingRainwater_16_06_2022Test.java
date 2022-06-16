package org.example;

import org.junit.jupiter.api.Test;

import static org.example.TrappingRainwater_16_06_2022.trapped;
import static org.junit.jupiter.api.Assertions.*;

class TrappingRainwater_16_06_2022Test {
    @Test
    void test1(){
        int[] given = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6,trapped(given));
    }
}
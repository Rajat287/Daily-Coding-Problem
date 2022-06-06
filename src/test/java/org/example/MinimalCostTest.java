package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MinimalCostTest {

    @Test
    void minimumPaintCost() {
        int[] array = {10,5,2,7,8,7};
        int k = 3;
        int[] expected = {10,7,8,8};
        MinimalCost05_06_2022 costtopaint = new MinimalCost05_06_2022();
        assertArrayEquals(expected,costtopaint.MinimumPaintCost(array,k));
    }
}
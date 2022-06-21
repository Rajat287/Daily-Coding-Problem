package org.example;

import org.junit.jupiter.api.Test;

import static org.example.ArrangeRGB_21_06_2022.isSorted;
import static org.junit.jupiter.api.Assertions.*;

class ArrangeRGB_21_06_2022Test {
    @Test
    void test1(){
        char[] given = {'G','B','R','G','R','B'};
        char[] output = {'R','R','G','G','B','B'};
        assertArrayEquals(output,isSorted(given));
    }
    @Test
    void test2(){
        char[] given = {};
        char[] output = {};
        assertArrayEquals(output,isSorted(given));
    }
}
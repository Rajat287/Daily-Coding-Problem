package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Encoding_15_06_2022.*;
import static org.junit.jupiter.api.Assertions.*;

class Encoding_15_06_2022Test {
    @Test
    void test1(){
        String given = "AAAABBBCCDAA";
        assertEquals("4A3B2C1D2A",runLengthEncoding(given));

    }
    @Test
    void test2(){
        String given2 = "4A3B2C1D2A";
        assertEquals("AAAABBBCCDAA",runLengthDecoding(given2));
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import static org.example.CountDecodings_23_05_22.CountNumberDecodings;
import static org.junit.jupiter.api.Assertions.*;

class CountDecodings_23_05_22Test {

    @Test
    void countNumberDecodings() {
        char[] digits = {'1','2','3','4'};
        int n = digits.length;
        assertEquals(3,CountNumberDecodings(digits,n));
    }
}
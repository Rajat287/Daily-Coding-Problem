package org.example;

import org.junit.jupiter.api.Test;

import static org.example.RoomsRequired07_06_2022.findMinimumRoomsRequired;
import static org.junit.jupiter.api.Assertions.*;

class RoomsRequired07_06_2022Test {
        @Test
        void test1(){
                int[][] timin = {{30,75},{0,50},{60,150}};
                assertEquals(2,findMinimumRoomsRequired(timin,3));
        }
}
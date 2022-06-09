package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPath_09_06_2022Test {
    @Test
    void test1(){
        char[][] mat = {{'f','f','f','f'},
                {'t','t','f','t'},
                {'f','f','f','f'},
                {'f','f','f','f'}};
        ShortestPath_09_06_2022 sp = new ShortestPath_09_06_2022();
        assertEquals(7,sp.findShortestpathLength(mat,0,0,3,0));
    }
}
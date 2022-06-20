package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Minimum_Insert_20_06_2022.findMinInsertions;
import static org.junit.jupiter.api.Assertions.*;

class Minimum_Insert_20_06_2022Test {
    @Test
    void test1(){
        String str= "ccewnxhytsr";
        assertEquals(9,findMinInsertions(str.toCharArray(),0, str.length()-1));
    }
    @Test
    void test2(){
        String str = "d";
        assertEquals(0,findMinInsertions(str.toCharArray(),0, str.length()-1));
    }
    @Test
    void test3(){
        String str = "follow";
        assertEquals(2,findMinInsertions(str.toCharArray(),0, str.length()-1));
    }
}
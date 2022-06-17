package org.example;

import org.junit.jupiter.api.Test;

import static org.example.EditDistance_17_06_2022.minimumDistance;
import static org.junit.jupiter.api.Assertions.*;

class EditDistance_17_06_2022Test {
    @Test
    void test1(){
        String s1 = "horse";
        String s2 = "ros";
        assertEquals(3,minimumDistance(s1,s2));
    }
    @Test
    void test2(){
        String s1 = "";
        String s2 = "abc";
        assertEquals(3,minimumDistance(s1,s2));
    }
    @Test
    void test3(){
        String s1 = "intention";
        String s2 = "execution";
        assertEquals(5,minimumDistance(s1,s2));
    }

}
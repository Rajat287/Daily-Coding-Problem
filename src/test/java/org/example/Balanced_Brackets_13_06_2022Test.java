package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.example.Balanced_Brackets_13_06_2022.isBalanced;
import static org.junit.jupiter.api.Assertions.*;

class Balanced_Brackets_13_06_2022Test {
    @Test
    void test1(){
        String s= "([])[]({})";
        assertTrue(isBalanced(s));
    }
    @Test
    void test2(){
        String s= "([)]";
        Assertions.assertTrue(isBalanced(s));;
    }
    @Test
    void test3(){
        String s= "((()";
        assertTrue(isBalanced(s));
    }
}
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PossibleReconstruction_08_06_2022Test {
    @Test
    void test1(){
        String[] dict = {"bed","bath","bedbath", "and","beyond"};
        String given = "bedbathandbeyond";
        List<String> expected = Arrays.asList("bed","bath","and","beyond");

        Assertions.assertLinesMatch(expected, PossibleReconstruction_08_06_2022.reconstruction(given,dict));
    }
}
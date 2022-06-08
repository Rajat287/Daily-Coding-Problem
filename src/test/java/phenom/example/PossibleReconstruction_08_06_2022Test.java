package phenom.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static phenom.example.PossibleReconstruction_08_06_2022.*;
class PossibleReconstruction_08_06_2022Test {
    @Test
    void test1(){
        String[] dict = {"bed","bath","bedbath", "and","beyond"};
        String given = "bedbathandbeyond";
        PossibleReconstruction_08_06_2022.removeDuplicates(dict);
        List<String> expected = Arrays.asList("bed","bath","and","beyond");
//        List<String> result = reconstruction(given).ToList<>();
        assertLinesMatch(expected,reconstruction(given));
    }
}
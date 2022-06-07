package org.example;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.example.RoomsRequired07_06_2022.findMinimumRoomsRequired;
import static org.junit.jupiter.api.Assertions.*;

class RoomsRequired07_06_2022Test {
        private static final Logger logger = LogManager.getLogger(RoomsRequired07_06_2022.class);
        @Test
        void test1(){
                BasicConfigurator.configure();
                int[][] timin = {{30,75},{0,50},{60,150}};
                logger.debug(findMinimumRoomsRequired(timin,3));
        }
}
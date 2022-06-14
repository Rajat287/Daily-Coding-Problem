//Given a Stream of elements too large to store in memory, pick a random element from the stream
//        with from the stream with uniform probability.
package org.example;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

import java.util.Random;
public class RandomInteger {
    private static final Logger log = LogManager.getLogger(RandomInteger.class);
    int ans;
    int Selectrandom_01_06_2022(int[] arr){
        Random r = new Random();
        ans = r.nextInt(arr.length);
        return ans;
    }

    public static void main(String[] args) {
        String log4jConfPath = "/home/rajatyadav/IdeaProjects/DCP/src/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        int[] arr = {1,2,3,4,5};
        RandomInteger rr = new RandomInteger();
        log.info(rr.Selectrandom_01_06_2022(arr));

    }
}

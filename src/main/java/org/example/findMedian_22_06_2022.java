package org.example;

import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.*;

public class findMedian_22_06_2022 {
    private static final Logger logger = LogManager.getLogger(findMedian_22_06_2022.class);

    static void resultMedian(int[] arr){
        String log4jConfPath = "/home/rajatyadav/IdeaProjects/DCP/src/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
            if(al.size()==1){
                logger.info(al.get(0));
            } else if (al.size()==2) {
                float res = (float)(al.get(0)+al.get(1))/2;
                logger.info(res);
            }else{
                Collections.sort(al);
                if(al.size()%2 == 0){
                    int n = al.size()/2;
                    float result = (float)(al.get(n)+al.get(n-1))/2;
                    logger.info(result);
                }else {
                    logger.info(al.get((al.size()-1)/2));
                }
            }


        }
    }

    public static void main(String[] args) {
        int[] given = {2,1,5,7,2,0,5};
        resultMedian(given);
    }
}

package org.example;

import java.util.*;


public class PossibleReconstruction_08_06_2022 {

    static  List<String> words = new ArrayList<>();
    static List reconstruction(String s,String[] dict){
        int size = s.length();
        if(size==0){
            return words;
        }
        for (int j=0;j<=size;j++){
            if(Arrays.asList(dict).contains(s.substring(0,j))){
                words.add(s.substring(0,j));
                reconstruction(s.substring(j,size),dict);
                break;
            }
        }
        return words;
    }
}

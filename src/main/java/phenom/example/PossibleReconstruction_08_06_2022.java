package phenom.example;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleReconstruction_08_06_2022 {

    static  ArrayList<String> words = new ArrayList<>();
    private static HashSet<String> modifiedDict = new HashSet<>();
    static ArrayList reconstruction(String s){
        int size = s.length();
        if(size==0){
            return words;
        }
        for (int j=0;j<=size;j++){
            if(modifiedDict.contains(s.substring(0,j))){
                words.add(s.substring(0,j));
                reconstruction(s.substring(j,size));
                break;
            }
        }
        return words;
    }
    static void removeDuplicates(String[] dict){
        for(String i:dict ){
            if (modifiedDict.contains(i)){
                continue;
            }else {
                modifiedDict.add(i);
            }
        }
    }
//    public static void main(String[] args) {
//        String[] dict = {"bed","bath","bedbath", "and","beyond"};
//        String given = "bedbathandbeyond";
//
//        System.out.println(reconstruction(given));
//        System.out.println(modifiedDict);
//    }
}

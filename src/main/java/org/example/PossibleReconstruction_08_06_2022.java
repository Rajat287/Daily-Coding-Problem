package org.example;
/*Given a dictionary of words and a string made up of those words(no spaces), return the original sentence
 in a list. If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction
 , then return null.
 For example : given set of words 'quick','brown','the','fox', and the string "thequickbrownfox",
 you should return ['the','quick','brown','fox']*/
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

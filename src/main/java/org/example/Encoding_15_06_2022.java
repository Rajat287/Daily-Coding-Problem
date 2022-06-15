package org.example;
/*Run-length encoding is a fast and simple method of encoding strings.
The basic idea is to represent repeated successive characters as a single count and character.
For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
Implement run-length encoding and decoding. You can assume the string to be encoded
have no digits and consists solely of alphabetic characters.
You can assume the string to be decoded is valid.*/
public class Encoding_15_06_2022 {
    static String runLengthEncoding(String s){
        StringBuilder result = new StringBuilder();
        //st
        char prev=s.charAt(0);
        char curr;
        int count=1;
        for(int i=1;i<s.length();i++){
            curr = s.charAt(i);
            if(curr==prev){
                count++;
            }else{
                result.append(count);
                result.append(prev);
                count=1;
                prev = curr;
            }
            if(i==s.length()-1){
                result.append(count);
                result.append(curr);
            }
        }
        return result.toString();
    }
    static String runLengthDecoding(String s){
        StringBuilder result = new StringBuilder();
        //increment of 2 is given so that i can jump to character which can become integers.
        for(int i=0;i<s.length()-1;i=i+2){
            char c = s.charAt(i+1);//storing the character which needs to repeated.
            int count = Character.getNumericValue(s.charAt(i));
            //append character till count>0
            while (count >0){
                result.append(c);
                count--;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}

package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class RandomProb_01_07_2022 {
    static int rand5(){
        Random r = new Random();
        int i =r.nextInt(5);
        return i;
    }
    static int rand7(){
        int res = 5*rand5()+rand5();
        while(res>=21){
            return rand7();
        }
        return res%7+1;
    }

    public static void main(String[] args) {
        System.out.println(rand5());
    }
}

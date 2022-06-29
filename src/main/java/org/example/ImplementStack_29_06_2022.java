package org.example;

import java.util.ArrayList;
import java.util.List;

public class ImplementStack_29_06_2022 {
    static List<Integer> st = new ArrayList<>();
    static int max = Integer.MIN_VALUE;
    static void push(int value){
        if(st.isEmpty()){
            st.add(value);
            max = value;
        } else if (value>max) {
            st.add(2*max+value);
            max = value;
        }
        else {
            st.add(value);
        }
    }
    static int pop(){
        if(st.isEmpty()){
            return 0;
        } else if (st.get(st.size()-1)>max) {
            int t = max;
           max = (st.get(st.size()-1)-max)/2;
           st.remove(st.size()-1);
           return t;
        }
        int t = st.get(st.size()-1);
        st.remove(st.size()-1);
        return t;
    }
    static int getMax(){
        if (st.isEmpty()){
            return 0;
        }
        return max;
    }

    public static void main(String[] args) {
        push(8);
        push(10);
        push(11);
        push(12);
        push(6);
        push(7);
        System.out.println(getMax());
        System.out.println(st.toString());
        System.out.println(pop());
        System.out.println(getMax());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(getMax());
        System.out.println(pop());
        System.out.println(getMax());
        System.out.println(pop());System.out.println(pop());System.out.println(pop());

    }
}

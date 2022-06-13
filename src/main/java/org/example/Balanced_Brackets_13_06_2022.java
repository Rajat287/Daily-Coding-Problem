package org.example;
/*Given a string of round,curly,and square open and closing brackets,
return whether the brackets are balanced(well-formed).
For example, given the string
"([])[]({})", you should return true.
Given the string "([)]" or "((()", you should return false.
 */
import java.util.Stack;

public class Balanced_Brackets_13_06_2022 {
    static  Stack<Character> st = new Stack<>();
    static  boolean isBalanced(String s){
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if ((s.charAt(i)==')'&&st.peek()=='(')||(s.charAt(i)=='}'&&st.peek()=='{')||(s.charAt(i)==']'&&st.peek()=='[')){
                    st.pop();
                }else {
                    return false;
                }
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}

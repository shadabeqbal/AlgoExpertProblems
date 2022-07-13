package stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedBrackets {
    public static void compute(){
        //String str = "(([]()()){})";
        String str = ")([()]";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(st.empty() && (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']')){
                st.push(str.charAt(i));
                break;
            }
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                st.push(str.charAt(i));
            else{
                if(str.charAt(i) == ')' && st.peek() == '(')
                    st.pop();
                else if(str.charAt(i) == '}' && st.peek() == '{')
                    st.pop();
                else if(str.charAt(i) == ']' && st.peek() == '[')
                    st.pop();
                else
                    break;
            }
        }

        if(st.empty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}

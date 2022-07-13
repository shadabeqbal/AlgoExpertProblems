package strings;

import java.util.Collections;
import java.util.Stack;

public class ReverseWordsInString {
    public static void compute(){
        String str = "AlgoExpert is the best!";
        Stack<String> st = new Stack<>();
        int start = 0, i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i) == ' ') {
                st.push(str.substring(start, i));
                start = i + 1;
            }
        }

        st.push(str.substring(start,i));
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.pop());
            ans.append(" ");
        }

        ans.deleteCharAt(ans.length()-1);

        System.out.println(ans);
    }
}

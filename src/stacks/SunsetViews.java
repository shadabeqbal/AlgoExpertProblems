package stacks;

import java.util.*;

public class SunsetViews {
    public static void compute(){
        List<Integer> lst = Arrays.asList(3,5,4,4,3,1,3,2);
        Stack<Integer> st = new Stack<>();
        String side = "EAST";
        int x;
        if(side == "EAST"){
            for (Integer integer : lst) st.push(integer);
            x = st.size()-1;
        }else{
            for(int i=lst.size()-1;i>=0;i--)
                st.push(lst.get(i));
            x = 0;
        }

        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        while(!st.empty()){
            if(max < st.peek()){
                max = st.peek();
                ans.add(x);
            }
            st.pop();
            if(side == "EAST")
                x--;
            else
                x++;
        }

        if(side == "EAST")
            Collections.reverse(ans);

        for(int i: ans)
            System.out.print(i+" ");


    }
}

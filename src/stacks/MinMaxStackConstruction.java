package stacks;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class MinMaxStackConstruction {
    static List<Integer> st = new ArrayList<>();
    static List<Pair<Integer,Integer>> stpair = new ArrayList<>();

    public static void compute(){
        push(5);
        getMin();
        getMax();
        peek();
        push(7);
        getMin();
        getMax();
        peek();
        push(2);
        getMin();
        getMax();
        peek();
        pop();
        getMin();
        getMax();
        peek();
    }

    public static void peek(){
        System.out.println(st.get(st.size()-1));
    }

    public static void pop(){
        st.remove(st.size()-1);
        stpair.remove(stpair.size()-1);
    }

    public static void push(int n) {
        if (stpair.size() <= 0){
            stpair.add(new Pair<>(n, n));
        }else{
            Pair<Integer,Integer> pr = stpair.get(stpair.size() - 1);
            stpair.add(new Pair<>(Math.min(pr.getKey(),n),Math.max(pr.getValue(),n)));
        }

        st.add(n);
    }

    public static void getMin(){
        System.out.println(stpair.get(stpair.size()-1).getKey());
    }

    public static void getMax(){
        System.out.println(stpair.get(stpair.size()-1).getValue());
    }

}

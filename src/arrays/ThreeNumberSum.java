package arrays;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeNumberSum {
    public static void compute(){
        List<Integer> arr = Arrays.asList(12,3,1,2,-6,5,-8,6);
        int key = 0;
        Collections.sort(arr);
        int current = 0,l = current + 1,r = arr.size() - 1;
        HashSet<Pair<Integer,Pair<Integer,Integer>>> st = new HashSet<>();
        while(current <= arr.size()-3){
            if(l >= r) {
                current++;
                l = current + 1;
                r = arr.size() - 1;
                continue;
            }

            if(arr.get(current) + arr.get(l) + arr.get(r) == key){
                Pair<Integer,Integer> num = new Pair<>(arr.get(l),arr.get(r));
                Pair<Integer,Pair<Integer,Integer>> final_num = new Pair<>(arr.get(current),num);
                st.add(final_num);
                l++;
                r--;
            }else if(arr.get(current) + arr.get(l) + arr.get(r) > key){
                r--;
            }else{
                l++;
            }
        }

        for(Pair<Integer,Pair<Integer,Integer>> each: st){
            System.out.println("["+each.getKey()+","+each.getValue().getKey()+","+each.getValue().getValue()+"]");
        }
    }
}

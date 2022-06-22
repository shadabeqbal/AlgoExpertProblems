package arrays;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void compute(){
        int[][] arr = {{1,2},{3,4},{4,6},{4,8},{10,15},{12,14}};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(arr[0][0]);
        first.add(arr[0][1]);
        ans.add(first);
        int x = 0;
        int arr_size = arr.length;
        for(int i=1;i<arr_size;i++){
            if(ans.get(x).get(1) >= arr[i][0])
                ans.get(x).set(1,arr[i][1]);
            else {
                List<Integer> tempArr = new ArrayList<>();
                tempArr.add(arr[i][0]);
                tempArr.add(arr[i][1]);
                ans.add(tempArr);
                x++;
            }
        }
        ArrayList<Pair<Integer,Integer>> ans1 = new ArrayList<>();

        for(List<Integer> i : ans) {
            Pair<Integer,Integer> p = new Pair<>(i.get(0),i.get(1));
            ans1.add(p);
        }

        for(Pair<Integer,Integer> p: ans1)
            System.out.println("["+p.getKey()+","+p.getValue()+"]");
    }
}

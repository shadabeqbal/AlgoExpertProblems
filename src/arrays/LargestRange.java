package arrays;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LargestRange {
    public static void compute(){
        List<Integer> arr = Arrays.asList(1,11,3,0,15,5,2,4,10,7,12,6);
        HashMap<Integer,Boolean> hm = new HashMap<>();
        List<Pair<Integer,Integer>> ansPairs = new ArrayList<>();
        for(int i: arr)
            hm.put(i,true);

        int leftRange = Integer.MIN_VALUE;
        int rightRange = Integer.MAX_VALUE;
        int maxRange = Integer.MIN_VALUE;

        for(int i=0;i<arr.size();i++){
            int current = arr.get(i);
            if(hm.get(current)){
                hm.put(current,false);

                //left side
                int leftSide = current;
                while(hm.containsKey(leftSide-1)) {
                    hm.put(leftSide-1, false);
                    leftRange = leftSide-1;
                    leftSide-=1;
                }

                //right side
                int rightSide = current;
                while(hm.containsKey(rightSide+1)) {
                    hm.put(rightSide+1, false);
                    rightRange = rightSide+1;
                    rightSide+=1;
                }

                ansPairs.add(new Pair<>(leftSide, rightSide));
                maxRange = Math.max(maxRange, rightRange - leftRange);
            }
        }

        for(Pair<Integer,Integer> eachPair: ansPairs)
            System.out.println("["+eachPair.getKey()+","+eachPair.getValue()+"]");


        System.out.println(maxRange);
    }
}

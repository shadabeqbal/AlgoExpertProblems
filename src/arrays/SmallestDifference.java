package arrays;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestDifference {
    public static void compute(){
        List<Integer> arr1 = Arrays.asList(-1,5,10,20,28,3);
        List<Integer> arr2 = Arrays.asList(26,134,135,15,17);

        Collections.sort(arr1);
        Collections.sort(arr2);

        int p = 0, q = 0;
        int current_min = Integer.MAX_VALUE;
        Pair<Integer,Integer> nums = new Pair<>(-1,-1);
        while(p < arr1.size()-1 && q < arr2.size()-1){
            if(arr1.get(p) == arr2.get(q)){
                current_min = 0;
                Pair<Integer,Integer> tempNum = new Pair<>(arr1.get(p),arr2.get(q));
                nums = tempNum;
                p++;
                q++;
            }else if(arr1.get(p) < arr2.get(q)){
                p++;
                if(Math.abs(arr1.get(p)-arr2.get(q)) < current_min){
                    Pair<Integer,Integer> tempNum = new Pair<>(arr1.get(p),arr2.get(q));
                    nums = tempNum;
                }
                current_min = Math.min(current_min,Math.abs(arr1.get(p)-arr2.get(q)));
            }else{
                q++;
                if(Math.abs(arr1.get(p)-arr2.get(q)) < current_min){
                    Pair<Integer,Integer> tempNum = new Pair<>(arr1.get(p),arr2.get(q));
                    nums = tempNum;
                }
                current_min = Math.min(current_min,Math.abs(arr1.get(p)-arr2.get(q)));
            }
        }

        System.out.println(current_min);
        System.out.println(nums.getKey()+" "+nums.getValue());
    }
}

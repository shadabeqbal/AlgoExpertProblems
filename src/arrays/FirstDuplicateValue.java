package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FirstDuplicateValue {
    //Time O(N) | Space O(N)
    public static void impl1(List<Integer> arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr){
            if(hs.contains(i)) {
                System.out.println(i);
                return;
            }else{
                hs.add(i);
            }

        }
    }

    //Time O(N) | Space O(1)
    public static void impl2(List<Integer> arr){
        for(int i: arr){

            int index = Math.abs(i) - 1;
            if(arr.get(index) < 0) {
                System.out.println(Math.abs(arr.get(index)));
                return;
            }else {
                arr.set(index, -arr.get(index));
            }
        }
    }
    public static void compute(){
        List<Integer> arr = Arrays.asList(5,1,3,2,5,3);
        impl1(arr);
        impl2(arr);
    }
}

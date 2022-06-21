package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    public static void compute(){
        List<Integer> arr = Arrays.asList(2,1,2,2,2,3,4,2);
        int key = 2;
        int l = 0, r = arr.size()-1;
        while(l < r){
            if(arr.get(r) == key)
                r--;
            else if(arr.get(l) == key){
                int temp = arr.get(l);
                arr.set(l,arr.get(r));
                arr.set(r,temp);
                l++;
            }else {
                l++;
            }
        }

        for(int i: arr)
            System.out.print(i+" ");
    }
}

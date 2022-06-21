package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayOfProducts {
    public static void compute(){
        List<Integer> arr = Arrays.asList(5,1,4,2);
        int product = 1;
        for(int i: arr)
            product *= i;

        for(int i: arr)
            System.out.print(product/i+" ");
    }
}

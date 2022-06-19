package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonConstructibleChange {

    public static void compute(){
        List<Integer> array = Arrays.asList(5,7,1,1,2,3,22);
        int change = 0;
        int ans = -1;
        Collections.sort(array);
        for(int i=0;i<array.size();i++){
            if(change+1 < array.get(i)) {
                ans = change + 1;
            }
            change = change + array.get(i);

        }

        System.out.println(ans);
    }
}

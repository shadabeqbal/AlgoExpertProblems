package arrays;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){

        int x = 0;
        for (Integer integer : array) {
            if (integer.equals(sequence.get(x))) {
                x++;
                if (x == sequence.size())
                    return true;
            }
        }

        return false;
    }

    public static void compute(){
        List<Integer> array = Arrays.asList(1,2,3,4);
        List<Integer> sequence = Arrays.asList(2,1,4);

        System.out.println(isValidSubsequence(array,sequence));
    }
}

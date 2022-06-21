package arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;

//Monotonic : Non increasing or non decreasing
public class MonotonicArray {
    public static Boolean isIncreasing(List<Integer> arr){
        int flag = 0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1) <= arr.get(i))
                continue;
            else{
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            return false;

        return true;
    }

    public static Boolean isDecreasing(List<Integer> arr){
        int flag = 0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1) >= arr.get(i))
                continue;
            else{
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            return false;

        return true;
    }
    public static void compute(){
        List<Integer> arr = Arrays.asList(-1,-5,-10,-1100,-1100,-1101,-1102,-9001);
        Boolean isIncreasing = isIncreasing(arr);
        Boolean isDecreasing = isDecreasing(arr);

        if(isIncreasing)
            System.out.println("Increasing "+isIncreasing);
        else if(isDecreasing)
            System.out.println("Decreasing "+isDecreasing);
        else
            System.out.println("Non Monotonic "+false);
    }
}

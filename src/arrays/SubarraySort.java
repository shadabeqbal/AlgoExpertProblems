package arrays;

import java.util.Arrays;
import java.util.List;

public class SubarraySort {
    public static void compute(){
        List<Integer> arr = Arrays.asList(1,2,4,7,10,11,7,12,6,7,16,18,19);

        //check for adjacent unordered element
        int low = -1,high = -1;
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i) > arr.get(i+1) || arr.get(i) < arr.get(i-1)) {
                if(low == -1)
                    low = i;
                else
                    high = i;
            }
        }

        //find lowest and highest element in between the unordered subarray
        int lowest = Integer.MAX_VALUE,highest = Integer.MIN_VALUE;
        for(int i=low;i<=high;i++){
            lowest = Math.min(lowest,arr.get(i));
            highest = Math.max(highest,arr.get(i));
        }

        //check the correct position for lowest and highest
        int minIndex = -1, maxIndex = -1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) > lowest) {
                minIndex = i;
                break;
            }
        }

        for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i) < highest) {
                maxIndex = i;
                break;
            }
        }

        System.out.println(minIndex+" "+maxIndex);

    }
}

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPeak {
    public static void compute(){
        List<Integer> arr = Arrays.asList(1,2,3,3,4,0,10,6,5,-1,-3,2,3);
        int longestPeak = -1;
        List<Integer> peaks = new ArrayList<>();
        for(int i=1;i<arr.size()-2;i++){
            if(arr.get(i) > arr.get(i-1) && arr.get(i) > arr.get(i+1))
                peaks.add(i);
        }
        for(int i: peaks){
            int l = i;
            int r = i;
            int lcnt = 0,rcnt = 0;
            while(arr.get(l-1) < arr.get(l)) {
                lcnt++;
                l--;
            }
            while(arr.get(r) > arr.get(r+1)) {
                rcnt++;
                r++;
            }

            longestPeak = Math.max(lcnt+rcnt+1,longestPeak);
        }

        System.out.println(longestPeak);
    }
}

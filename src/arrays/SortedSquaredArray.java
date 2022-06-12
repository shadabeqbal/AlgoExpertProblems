package arrays;

import java.util.*;

public class SortedSquaredArray {
    public static List<Integer> sortedSquaredArray(List<Integer> array){
        List<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = array.size() - 1;
        while(low <= high){
            if(Math.abs(array.get(low)) > Math.abs(array.get(high))){
                ans.add(array.get(low) * array.get(low));
                low++;
            }else{
                ans.add(array.get(high) * array.get(high));
                high--;
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void compute(){
        List<Integer> array = Arrays.asList(-9,-6,-1,2,4,12);
        List<Integer> ans = sortedSquaredArray(array);
        for(Integer integer: ans)
            System.out.print(integer+" ");
    }
}

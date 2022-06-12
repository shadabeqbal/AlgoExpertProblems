package arrays;

import java.util.*;

public class TwoNumberSum {

    public static List<Integer> twoNumberSum(List<Integer> array, int targetSum){
        Map<Integer,Boolean> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(Integer integer: array){
            if(mp.containsKey(targetSum - integer)){
                ans.add(integer);
                ans.add(targetSum - integer);
            }else{
                mp.put(integer,true);
            }
        }

        return ans;
    }

    public static void compute(){
        List<Integer> array = Arrays.asList(3,5,-4,8,11,1,-1,6);
        int targetSum = 10;
        List<Integer> twoNumbers = twoNumberSum(array,targetSum);
        for(Integer integer: twoNumbers)
            System.out.print(integer+" ");
    }
}

package arrays;

import javafx.util.Pair;

import java.util.*;

public class FourNumberSum {
    public static void compute(){
        List<Integer> arr = Arrays.asList(7,6,4,-1,1,2);
        int key = 16;
        HashMap<Integer, Pair<Integer,Integer>> hm = new HashMap<>();
        boolean flag = false;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            for(int j = i+1;j<arr.size();j++){
                if(!(hm.containsKey(key - (arr.get(i) + arr.get(j))))) {
                    Pair<Integer, Integer> pr = new Pair<>(arr.get(i), arr.get(j));
                    hm.put(arr.get(i) + arr.get(j), pr);
                }else{
                    Pair<Integer,Integer> nums = hm.get(key - (arr.get(i)+arr.get(j)));
                    List<Integer> oneList = new ArrayList<>();
                    oneList.add(arr.get(i));
                    oneList.add(arr.get(j));
                    oneList.add(nums.getKey());
                    oneList.add(nums.getValue());
                    Collections.sort(oneList);
                    if(!ans.contains(oneList) && !nums.getKey().equals(arr.get(i)) &&
                            !nums.getKey().equals(arr.get(j)) && !nums.getValue().equals(arr.get(i)) &&
                            !nums.getValue().equals(arr.get(j)))
                        ans.add(oneList);
                }
            }
        }

        for(List<Integer> i: ans){
            for(Integer j: i){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

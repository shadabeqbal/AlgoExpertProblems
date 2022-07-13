package strings;

import java.util.*;

public class GroupAnagrams {
    public static void compute(){
        List<String> str = Arrays.asList("yo","act","flop","tac","cat","oy","olfp");
        List<String> sortedStr = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<Integer>> hm = new HashMap<>();

        for(String each: str){
            char[] tempArray = each.toCharArray();
            Arrays.sort(tempArray);
            sortedStr.add(Arrays.toString(tempArray));
        }

        for(int s=0;s<sortedStr.size();s++){
            if(!hm.containsKey(sortedStr.get(s))) {
                List<Integer> intIndex = new ArrayList<>();
                intIndex.add(s);
                hm.put(sortedStr.get(s), intIndex);
            } else
                hm.get(sortedStr.get(s)).add(s);
        }

        for(Map.Entry<String,List<Integer>> entry: hm.entrySet()){
            List<String> tempAns = new ArrayList<>();
            for(int each: entry.getValue()){
                tempAns.add(str.get(each));
            }
            ans.add(tempAns);
        }

        for(List<String> eachList : ans){
            for(String eachString : eachList){
                System.out.print(eachString+" ");
            }
            System.out.println();
        }
    }
}

package extra;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static void compute(){
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> eachList = new ArrayList<>();

        eachList.add(4);
        eachList.add(1);
        eachList.add(3);
        arr.add(eachList);
        List<Integer> eachList1 = new ArrayList<>();
        eachList1.add(2);
        eachList1.add(2);
        eachList1.add(5);
        arr.add(eachList1);
        List<Integer> eachList2 = new ArrayList<>();
        eachList2.add(5);
        eachList2.add(6);
        eachList2.add(8);
        arr.add(eachList2);
        List<Integer> eachList3 = new ArrayList<>();
        eachList3.add(6);
        eachList3.add(6);
        eachList3.add(8);
        arr.add(eachList3);

        int bandwidth = arr.get(0).get(0);
        for(int i=1;i<arr.size();i++)
        {
            int startTime = arr.get(i).get(1);
            int endTime = arr.get(i-1).get(2);
            if(endTime >= startTime){
                bandwidth = Math.max(bandwidth+arr.get(i).get(0),arr.get(i).get(0));

            }

        }

    }
}

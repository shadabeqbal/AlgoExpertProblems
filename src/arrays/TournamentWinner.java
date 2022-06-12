package arrays;

import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(List<List<String>> competitions,List<Integer> results){
        Map<String,Integer> hm = new HashMap<>();
        String bestTeam;
        for(int i=0;i<competitions.size();i++){
            if(results.get(i) == 0){
                if(!hm.containsKey(competitions.get(i).get(1)))
                    hm.put(competitions.get(i).get(1),3);
                else
                    hm.put(competitions.get(i).get(1),hm.get(competitions.get(i).get(1)+3));
            }else{
                if(!hm.containsKey(competitions.get(i).get(0)))
                    hm.put(competitions.get(i).get(0),3);
                else
                    hm.put(competitions.get(i).get(0),hm.get(competitions.get(i).get(0))+3);
            }
        }

        bestTeam = Collections.max(hm.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

        return bestTeam;
    }

    public static void compute(){
        List<List<String>> array = Arrays.asList(
                Arrays.asList("HTML","C#"),
                Arrays.asList("C#","PYTHON"),
                Arrays.asList("PYTHON","HTML")
        );

        List<Integer> result = Arrays.asList(0,0,1);
        String bestTeam = tournamentWinner(array,result);

        System.out.println(bestTeam);
    }
}

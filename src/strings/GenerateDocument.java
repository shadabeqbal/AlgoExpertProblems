package strings;

import java.sql.SQLOutput;
import java.util.HashMap;

public class GenerateDocument {
    public static void compute(){
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c: characters.toCharArray()){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

        for(char c: document.toCharArray()){
            if(hm.containsKey(c) && hm.get(c) > 0){
                hm.put(c,hm.get(c)-1);
            }else{
                System.out.println("We cannot create the document!");
                return;
            }
        }

        System.out.println("We can create the document!");

    }
}

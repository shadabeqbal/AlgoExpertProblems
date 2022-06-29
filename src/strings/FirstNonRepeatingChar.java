package strings;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void compute(){
        String str = "abcdcaf";
        HashMap<Character,Integer> hm = new HashMap<>();

        for(char c: str.toCharArray()){
            if(hm.containsKey(c))
                hm.put(c,hm.get(c)+1);
            else
                hm.put(c,1);
        }

        for(int c=0;c<str.length();c++){
            if(hm.get(str.charAt(c)) == 1){
                System.out.println("Found our Character at index "+c);
                break;
            }
        }
    }
}

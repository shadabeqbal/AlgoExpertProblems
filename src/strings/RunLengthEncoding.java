package strings;

import java.util.Arrays;
import java.util.Objects;

public class RunLengthEncoding {
    private static void compute(String str){
        int length = 1;
        String[] arr = new String[str.length()];
        int x = 0;
        for(int i=1;i<str.length();i++){
            if(length != 9 && str.charAt(i) == str.charAt(i-1)){
                length+=1;
            }else{
                arr[x] = String.valueOf(length);
                x++;
                arr[x] = Character.toString(str.charAt(i-1));
                x++;
                length = 1;
            }
        }

        arr[x] = String.valueOf(length);
        x++;
        arr[x] = Character.toString(str.charAt(str.length()-1));
        String[] cleanedArray = Arrays.stream(arr).filter(Objects::nonNull).toArray(String[]::new);
        System.out.println(Arrays.toString(cleanedArray));
    }

    public static void RunLengthEncoding(){
        String str = "AAAAAAAAAAAAABBCCCCDD";
        compute(str);
    }

}

package strings;

public class PalindromeCheck {
    public static boolean compute(String str){

        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString())){
            return true;
        }

        return false;
    }
}

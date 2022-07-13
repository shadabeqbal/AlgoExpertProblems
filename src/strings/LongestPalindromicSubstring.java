package strings;

import javafx.util.Pair;

public class LongestPalindromicSubstring {

    private static Pair<Integer,Integer> getLongestPalindromeFrom(String str, int leftIdx, int rightIdx){
        while(leftIdx >= 0 && rightIdx < str.length()){
            if(str.charAt(leftIdx) != str.charAt(rightIdx))
                break;

            leftIdx-=1;
            rightIdx+=1;
        }

        return new Pair<>(leftIdx+1,rightIdx);
    }
    public static void compute(){
        Pair<Integer,Integer> pr = new Pair<>(0,1);
        String str = "abaxyzzyxf";
        int currentLongest = -1;
        for(int i=1;i<str.length();i++){
            Pair<Integer,Integer> odd = getLongestPalindromeFrom(str,i-1,i+1);
            Pair<Integer,Integer> even = getLongestPalindromeFrom(str,i-1,i);
            int longest = Math.max(odd.getValue()-odd.getKey(),even.getValue()-even.getKey());
            currentLongest = Math.max(longest, pr.getValue()-pr.getKey());
        }

        System.out.println(str.substring(currentLongest));
    }
}

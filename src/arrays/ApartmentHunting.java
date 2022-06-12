package arrays;

import sun.lwawt.macosx.CInputMethod;

import java.util.Arrays;
import java.util.List;

public class ApartmentHunting {
    static String[][] input = {{"School"},{"Gym"},{"Gym","School"},{"School"},{"School","Store"}};

    //Time O(N * k)
    public static int[] findNearestPlace2(String place){
        int[] places = new int[input.length];

        //from left to right
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++) {
                if (input[i][j].equals(place)){
                    places[i] = 0;
                    break;
                }else{
                    if(i == 0 || places[i-1] == -1)
                        places[i] = -1;
                    else {
                        places[i] = places[i - 1] + 1;
                    }
                }
            }
        }

        //from right to left
        for(int i=input.length-1;i>=0;i--){
            if(i != input.length - 1 && places[i] == -1)
                places[i] = places[i+1] + 1;
        }

        return places;
    }

    //Time O(N^2 * k)
    public static int[] findNearestPlace(String place){
        int[] places = new int[input.length];

        Arrays.fill(places,Integer.MAX_VALUE);

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                for(int k=0;k<input[j].length;k++){
                    if(input[j][k].equals(place))
                        places[i] = Math.min(places[i],Math.abs(i-j));
                }
            }
        }

        return places;
    }

    public static void findMinDistance(){
        int[] gymArray = findNearestPlace("Gym");
        int[] gymArray2 = findNearestPlace2("Gym");
        int[] schoolArray = findNearestPlace("School");
        int[] schoolArray2 = findNearestPlace2("School");
        int[] storeArray = findNearestPlace("Store");
        int[] storeArray2 = findNearestPlace2("Store");


        int val[] = new int[gymArray.length];

        for(int i=0;i<gymArray.length;i++){
            val[i] = Math.max(gymArray[i],Math.max(schoolArray[i],storeArray[i]));
        }

        int ans = val[0];
        int final_index = -1;
        for(int i=1;i<val.length;i++){
            if(ans > val[i]) {
                ans = val[i];
                final_index = i;
            }
        }

        System.out.println(final_index);
    }
}

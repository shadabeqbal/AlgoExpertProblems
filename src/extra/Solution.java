package extra;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
};
public class Solution {
    // 1
    // 2 3
    // 4 5 6 7
    // 8 9 10 11 12 13 14 15

    //1,2,3,7,6,5,4,8,9
    public static int subarraySum(){
        int[] arr = {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        arr1[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            arr1[i]=arr1[i-1]+arr[i];
        }
        arr2[arr2.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr2[i] = arr2[i+1] + arr[i];
        }
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            ans = Math.max(ans,Math.max(arr1[i],arr2[i]));
        }

        System.out.println(ans);
        return 0;

    }

    //int[] arr = {-1,-2,-3,-1,-5,-6,-7}

//                arr1 = {-1,-3,-6,-7,-12,-18,-25}
//                arr2 = {-25,-24,-22,-19,-18,-13,-7}
//
//                arr1 = {1,3,0,-1,4,-2,5}
//                arr2 = {5,4,2,5,6,1,7}
}

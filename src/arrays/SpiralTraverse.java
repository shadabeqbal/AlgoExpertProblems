package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static void compute(){
        int[][] arr = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        int sc = 0,ec = arr[0].length-1;
        int sr = 0, er = arr.length-1;
        List<Integer> ans = new ArrayList<>();
        while(sr < er && sc < ec){
            for(int i=sc;i<=ec;i++)
                ans.add(arr[sr][i]);

            for(int i=sr+1;i<=er;i++)
                ans.add(arr[i][ec]);

            for(int i=ec-1;i>=sc;i--)
                ans.add(arr[er][i]);

            for(int i=er-1;i>=sr+1;i--)
                ans.add(arr[i][sc]);

            sr = sr + 1;
            er = er - 1;
            sc = sc + 1;
            ec = ec - 1;
        }

        for(int i:ans)
            System.out.print(i+" ");
    }
}

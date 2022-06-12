package famousAlgo;

public class Kadane {
    public static int kadane(Integer[] arr){
        int sum = 0, best = 0;
        for(int i=0;i<arr.length;i++){
            sum = Math.max(arr[i],sum+arr[i]);
            best = Math.max(best,sum);
        }

        return best;
    }
}

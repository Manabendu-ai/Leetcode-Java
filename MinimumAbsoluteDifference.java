
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> minDifference(int arr[]){
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        int len = arr.length;
        for(int i = 1; i<len; i++){
            min_diff = Math.min(min_diff, arr[i]-arr[i-1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1; i<len; i++){
            if(arr[i]-arr[i-1] == min_diff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                result.add(pair);
            }
        }
        return result;
    }
}

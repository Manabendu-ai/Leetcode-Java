public class MinimumSizeSubArray {
    public int minsize(int target, int[] arr){
        int left = 0;
        int min_len = Integer.MAX_VALUE;
        int curr_sum = 0;
        for(int right = 0; right<arr.length ; right++){
            curr_sum += arr[right];
            while (curr_sum>= target){
                min_len = Math.min(min_len, right - left + 1);
                curr_sum -= arr[left];
                left++;
            }
        }
        return (min_len != Integer.MAX_VALUE) ? min_len : 0;
    }
}

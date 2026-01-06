import java.util.HashMap;

public class TwoSum{

    public static int[] twoSum(int nums[], int target){

        int len = nums.length;
        HashMap<Integer, Integer> num_index = new HashMap<>();
    
        for(int i = 0;i<len; i++){
            int diff = target - nums[i];
            if(num_index.containsKey(diff)){
                return new int[] {num_index.get(diff), i};
            }
            num_index.put(nums[i], i);
        }
        return new int[]{};
    }
    
    // Time Complexity : O(n)
    // Space Complexity : O(n)
}
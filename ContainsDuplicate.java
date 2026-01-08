import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n: nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
    // Time Complexity : O(n)
    // Space Complexity : O(n)
}


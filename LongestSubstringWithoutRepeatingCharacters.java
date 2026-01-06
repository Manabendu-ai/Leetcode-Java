import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int longest =0;
        int n =s.length();
        Set<Character> set = new HashSet<>();
        for(int r =0; r<n; r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            longest = Math.max(longest, r-l+1);
            set.add(s.charAt(r));
        }
        return longest;
    }
}

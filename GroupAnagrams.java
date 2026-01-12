import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> groups = new HashMap<>();
        int count[] = new int[26];
        for(String s : strs){
            Arrays.fill(count, 0);
            StringBuilder sb = new StringBuilder();
            for(Character c : s.toCharArray()){
                count[c - 'a']++;
                
            }
            sb.append(Arrays.toString(count));
            groups.putIfAbsent(sb.toString(), new ArrayList<>());
            groups.get(sb.toString()).add(s);
        }

        return new ArrayList<>(groups.values());

    }
}

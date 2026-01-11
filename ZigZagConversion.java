import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public String convert(String s, int numRows){
        if(numRows == 1){
            return s;
        }

        List<List<Character>> rows = new ArrayList<>();
        int level = 0;
        int d = 1;
        for(int j =0; j<numRows; j++){
            rows.add(new ArrayList<>());
        }

        for(int k =0; k<s.length(); k++){
            rows.get(level).add(s.charAt(k));
            if(level == 0){
                d = 1;
            }
            if(level == numRows-1){
                d = -1;
            }
            level += d;
        }

        StringBuilder sb = new StringBuilder();
        rows.forEach(
            x -> x.forEach(
                y -> sb.append(y)
            )
        );
        return sb.toString();
    }
}

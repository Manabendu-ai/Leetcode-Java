import java.util.HashMap;

public class VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character, Integer> ord = new HashMap<>();
        
        for(int i =0; i<order.length(); i++){
            ord.put(order.charAt(i), i);
        }

        for(int i =0; i<words.length-1; i++){
            for(int j =0; j<words[i].length(); j++){
                if(j >= words[i+1].length()){
                    return false;
                }
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int curr = ord.get(words[i].charAt(j));
                    int next = ord.get(words[i+1].charAt(j));

                    if(curr > next){
                        return false;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return true;
    }
}

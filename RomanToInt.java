import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String roman) {
        int number = 0;
        int len = roman.length();

        HashMap<Character, Integer> roman_map = new HashMap<>();
        roman_map.put('I', 1);
        roman_map.put('V', 5);
        roman_map.put('X', 10);
        roman_map.put('L', 50);
        roman_map.put('C', 100);
        roman_map.put('D', 500);
        roman_map.put('M', 1000);

        int left = 0;
        int right = 1;
        while(right < len){
            int curr = roman_map.get(roman.charAt(left));
            int next = roman_map.get(roman.charAt(right));
            if(curr >= next){
                number += curr;
                left++;
                right++;
            }
            else{
                int diff = next - curr;
                number += diff;
                left += 2;
                right += 2;
            }
        }
        if(left<len){
            char curr = roman.charAt(left);
            number += roman_map.get(curr);
            left++;
        }
        return number;
    }
}

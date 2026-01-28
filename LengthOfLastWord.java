public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int r = s.length()-1;
        int i = 0;
        while(s.charAt(r)==' '){
            r--;
        }

        while (r >= 0 && s.charAt(r) != ' '){
            i++;
            r--;
        }
        return i;
    }
}

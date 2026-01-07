public class AtoiConversion {

    public static int myAtoi(String s) {
        long res = 0;
        int sign = 1;
        int p =0;
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        if(s.charAt(p) == '-'){
            sign = -1;
            p++;
        }
        else if(s.charAt(p) == '+'){
            p++;
        }
        while(p<s.length()){
            char ch = s.charAt(p);
            if(ch < '0' || ch > '9'){
                break;
            }

            res = (res * 10) + (ch - '0'); 
            if(sign * res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE * sign;
            } 
            if(sign * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } 
            p++;
        }
        return (int) (res * sign);
    }
}

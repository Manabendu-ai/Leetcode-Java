public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int len = strs[0].length();
        int i = 0;
        for(i =0; i<len; i++){
            for(String s: strs){
                if(s.charAt(i) != strs[0].charAt(i) || i == s.length()){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);

    }
    
}

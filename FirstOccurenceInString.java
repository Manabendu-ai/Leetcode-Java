import java.util.Arrays;

public class FirstOccurenceInString {
    public int strStr(String haystack, String needle) {
        int h_len = haystack.length();
        int n_len = needle.length();

        if(n_len > h_len){
            return -1;
        }

        for(int i=0; i<=h_len-n_len;i++){
            int j =0;
            while(j<n_len && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==n_len){
                return i;
            }
        }
        return -1;
    }

}

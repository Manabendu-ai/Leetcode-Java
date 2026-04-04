public class DecodeChiperText {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols = encodedText.length()/rows;
        StringBuilder res = new StringBuilder();
        for(int i =0; i<cols; i++){
            for(int j = i; j<encodedText.length(); j+=cols+1){
                res.append(encodedText.charAt(j));
            }
        }

        while(res.length()>0 && res.charAt(res.length()-1) == ' '){
            res.deleteCharAt(res.length()-1);
        }
        return res.toString();
    }
}

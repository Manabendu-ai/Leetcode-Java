import java.util.Stack;

class ValidParanthesis {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        Stack<Character> braces = new Stack<>();
        int len = s.length();
        for(int i =0; i<len; i++){
            char b = s.charAt(i);
            if(b == '(' || b == '[' || b == '{'){
                braces.push(b);
            }else{
                if(braces.isEmpty()){
                    return false;
                }
                char top = braces.pop();
                if(!match(top, b)){
                    return false;
                }
            }
        }
        
        return braces.isEmpty();
    }

    public static boolean match(char open, char close){
        if (open == '(' && close == ')'){
            return true;
        }
        else if (open == '[' && close == ']'){
            return true;
        }
        else if (open == '{' && close == '}'){
            return true;
        }
        return false;
    }
}
public class StringBalancer {
    public int balancedStringSplit(String s) {
        int res = 0;
        int balancer = 0;
        for(char c: s.toCharArray()){
            if(c == 'R'){
                balancer++;
            }
            else if(c == 'L'){
                balancer--;
            }
            if(balancer == 0){
                res++;
            }
        }
        return res;
    }
}

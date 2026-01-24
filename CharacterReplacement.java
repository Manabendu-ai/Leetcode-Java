public class CharacterReplacement {
    public int characterReplacement(String s, int k) {
        int occ[] = new int[26];
        int left =0;
        int ans =0;
        int max = 0;

        for(int right=0; right<s.length(); right++){
            max = Math.max(max, ++occ[s.charAt(right)-'A']);
            int len = right-left + 1-max;
            if(len > k){
                occ[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(right-left+1, ans);
        }
        return ans;
    }
}

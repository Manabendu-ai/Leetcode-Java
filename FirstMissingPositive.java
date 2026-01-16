public class FirstMissingPositive {
        public int firstMissingPositive(int[] nums) {
            int containsOne = 0;
            int len = nums.length;
            for(int i =0; i<len; i++){
                if(nums[i] == 1){
                    containsOne++;
                    break;
                }
            }
            if(containsOne==0){
                return 1;
            }
            for(int i =0; i<len; i++){
                if(nums[i] <= 0 || nums[i]>len){
                    nums[i] = 1;
                }
            }

            for(int i =0; i<len; i++){
                int a = Math.abs(nums[i]);
                if(a == len){
                    nums[0] = -Math.abs(nums[i]);
                }else{
                    nums[a] = -Math.abs(nums[a]);
                }
            }

            for(int i = 0; i<len; i++){
                if(nums[i]>0){
                    return i;
                }
            }

            if(nums[0] > 0){
                return len;
            }
            return len+1;
        }
        // Time Complexity : O(n)
        // Space Complexity : O(1)
}

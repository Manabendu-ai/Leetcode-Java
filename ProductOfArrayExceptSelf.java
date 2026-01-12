public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];

        int pre=1, post = 1;
        for(int i =0; i<len; i++){
            ans[i] = pre;
            pre = nums[i]*pre;
        }
        for(int i=len-1;i>=0;i++){
            ans[i] = ans[i] * post;
            post = post * nums[i];
        }
        return ans;
    }
}

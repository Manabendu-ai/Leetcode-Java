public class TrappingRainWater {
    public int trap(int[] height) {
        int len = height.length;
        int water = 0;

        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = 0;
        right[len-1] = 0;
        for(int i = 1; i<len; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
            right[len-i-1] = Math.max(right[len-i], height[len-i]);
        }

        for(int i=0;i<len; i++){
            int store = Math.min(left[i], right[i]) - height[i];
            if(store > 0){
                water += store;
            }
        }
        return water;
    }
}

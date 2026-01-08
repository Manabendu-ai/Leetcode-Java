public class MostWaterContainer {
    public static int maxArea(int[] height) {
        if(height.length < 2){
            return 0;
        }
        int left = 0;
        int right = 1;
        int len = height.length;
        int streak = 0;
        int max = 1;
        int f = height[left];
        int r = height[right];
        if(height.length == 2){
            return Math.min(f, r) * 1;
        }
        while(right < len){
            if(f<r){
                f = r;
                if(max < streak){
                    max = streak;
                    streak = 1;
                }
                left++;
            } else{
                r = height[right];
                streak++;
            }
            right++;
        }
        System.out.println(f+" "+r+" "+max);
        return Math.min(f, r) * streak;
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
         System.out.println(maxArea(new int[] {11,6,12}));
    }
}

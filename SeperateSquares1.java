public class SeperateSquares1 {

    public double separateSquares(int[][] squares) {
        
        double y = 0, total_area = 0;
        double min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int[] sq: squares){
            y = sq[1];
            int len = sq[2];
            total_area+= len*len;
            min = Math.min(min, y);
            max = Math.max(max, len+y);
        }

        double target = total_area/2;
        double left = min, right = max;

        while(left < right){
            if((right - left)<Math.pow(10, -5)){
                break;
            }
            double mid = (right+left)/2;
            if(areaBelow(mid, squares) < target){
                left = mid;
            }else{
                y=mid;
                right=mid;
            }
        }
        return y;
    }

    public double areaBelow(double mid, int[][] squares) {
        double area = 0;
        for(int sq[] : squares){
            double y= sq[1], len = sq[2];

            if(mid >= (y+len)){
                area += len*len;
            } else if(mid > y && mid < (y+len)){
                area += len * (mid - y);
            }
        }
        return area;
    }
}

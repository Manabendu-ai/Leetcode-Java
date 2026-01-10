

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int A[] = nums1;
        int B[] = nums2;
        int total = A.length + B.length;
        int half = total/2;
        if(A.length > B.length){
            int temp[] = A;
            A = B;
            B = temp;
        }
        int l = -1;
        int r = A.length-1;
        int A_left = 0;
        int A_right = 0;
        int B_left = 0;
        int B_right = 0;
        while (true) {
            int i = (l+r)/2;
            int j = half - i - 2;

            A_left = (i>=0) ? A[i] : Integer.MIN_VALUE;
            A_right = ((i+1)<A.length) ? A[i+1] : Integer.MAX_VALUE;
            B_left = (j>=0) ? B[j] : Integer.MIN_VALUE;
            B_right = ((j+1)<B.length) ? B[j+1] : Integer.MAX_VALUE;

            if ((A_left <= B_right) && (B_left <= A_right)){
                if(total%2==1){
                    return Math.min(A_right, B_right);
                }
                return (double) (Math.max(A_left, B_left) + Math.min(A_right, B_right))/2;
            }
            else if(A_left > B_right){
                r = i - 1;
            } else{
                l = i+1;
            }
        }
    }
}

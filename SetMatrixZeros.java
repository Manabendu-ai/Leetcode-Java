public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int copy[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j =0; j<cols; j++){
                copy[i][j] = matrix[i][j];
            }
        }

        for(int i=0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(copy[i][j] == 0){
                    helper(matrix, i, j, rows, cols);
                }
            }
        }
    }

    public void helper(int[][] matrix, int i, int j, int r, int c){
        for(int k=0; k<r; k++){
            matrix[k][j] = 0;
        }
        for(int k=0; k<c; k++){
            matrix[i][k] = 0;
        }
    }
}

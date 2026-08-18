import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiral(int[][] matrix){
        int row, col;
        row = matrix.length;
        col = matrix[0].length;

        int row_begin = 0, row_end = row-1, col_begin = 0, col_end = col-1;

        List<Integer> result = new ArrayList<>();
        while(row_begin <= row_end && col_begin <= col_end){
            // Traversing right
            for(int i = col_begin ; i<=col_end; i++){
                result.add(matrix[row_begin][i]);
            }
            row_begin++;

            // Traversing down
            for(int i = row_begin; i<=row_end; i++){
                result.add(matrix[i][col_end]);
            }
            col_end--;

            // Traversing left
            if(row_begin<=row_end){
                for (int i = col_end; i >= col_begin; i--) {
                    result.add(matrix[row_end][i]);
                }
                row_end--;
            }

            // Traversing up
            if(col_begin <= col_end){
                for (int i = row_end; i >= row_begin; i--) {
                    result.add(matrix[i][col_begin]);
                }
                col_begin++;
            }
        }

        return result;
    }
}

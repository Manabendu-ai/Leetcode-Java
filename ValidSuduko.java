
import java.util.HashSet;
import java.util.Set;

public class ValidSuduko {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set;
        for(int i =0; i<9; i++){
            set = new  HashSet<>();
            for(int j =0; j<9; j++){
                char item = board[i][j];
                if(set.contains(item)){
                    return false;
                }
                else if(item != '.'){
                    set.add(item);
                }
            }
        }

        for(int i =0; i<9; i++){
            set = new  HashSet<>();
            for(int j =0; j<9; j++){
                char item = board[j][i];
                if(set.contains(item)){
                    return false;
                }
                else if(item != '.'){
                    set.add(item);
                }
            }
        }

        int[][] starts = {
            {0,0},{0,3},{0,6},
            {3,0},{3,3},{3,6},
            {6,0},{6,3},{6,6}
        };

        for(int[] start : starts){
            int i = start[0];
            int j = start[1];
            set = new HashSet<>();
            for(int r = i; r<i+3; r++){
                for(int c = j; c< j+3; c++){
                    char item = board[r][c];
                    if(set.contains(item)){
                        return false;
                    }
                    else if(item != '.'){
                        set.add(item);
                    }
                }
            }
        }

        return true;
    }
}

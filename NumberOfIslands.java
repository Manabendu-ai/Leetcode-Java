public class NumberOfIslands {
    public static int islands(String grid[][]){
        int row = grid.length;
        int col = grid[0].length;

        int total = 0;
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(grid[i][j].equals("1")){
                    dfs(i, j, grid, row, col);
                    total++;
                }
            }
        }
        return total;
    }

    public static void dfs(int i, int j, String[][] grid, int row, int col){
        if(i >= row || i < 0 || j >= col || j < 0 || grid[i][j].equals("v") || grid[i][j].equals("0")){
            return ;
        }
        grid[i][j] = "v";
        dfs(i+1,j,grid,row, col);
        dfs(i-1,j,grid,row, col);
        dfs(i,j+1,grid,row, col);
        dfs(i,j-1,grid,row, col);
    }

    public static void main(String[] args) {
        String[][] grid = {
            {"1","1","0","0","0"},
            {"1","1","0","0","0"},
            {"0","0","1","0","0"},
            {"0","0","0","1","1"},
        };

        int total = islands(grid);
        System.out.println(total);
    }
}

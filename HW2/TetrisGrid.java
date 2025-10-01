package HW2;

public class TetrisGrid {


    private boolean[][] grid;

    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }


    public void clearRows() {
        for( int r = grid.length - 1; r >= 1; r-- ) {
            for( int c = 0; c < grid[0].length; c++ ) {
                grid[r][c] = grid[r-1][c];
            }
        }
        for( int c = 0; c < grid[0].length; c++ ) {
            grid[0][c] = false;
        }
    }

    boolean[][] getGrid() {
        return grid; 
    }
}
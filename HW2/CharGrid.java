package HW2;

public class CharGrid {
    private char[][] grid;


    public CharGrid(char[][] grid) {
        this.grid = grid;
    }
    public int charArea(char ch) {
        for( int r1 = 0; r1 < grid.length; r1++ ) {
            for( int c1 = 0; c1 < grid[0].length; c1++ ) {
                if( grid[r1][c1] == ch ) {
                    for( int r2 = grid.length - 1; r2 >= r1; r2-- ) {
                        for( int c2 = grid[0].length - 1; c2 >= c1; c2-- ) {
                            if( grid[r2][c2] == ch ) {
                                return (r2 - r1 + 1) * (c2 - c1 + 1);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }
    public int countPlus() {
        int count = 0;
        for( int r = 0; r < grid.length - 1; r++ ) {
            for( int c = 0; c < grid[0].length - 1; c++ ) {
                if( grid[r][c] != ' ' ) {
                    char ch = grid[r][c];
                    int countUp = 0;
                    for( int i = r - 1; i >= 0 && grid[i][c] == ch; i-- ) {
                        countUp++;
                    }
                    int countDown = 0;
                    for( int i = r + 1; i < grid.length && grid[i][c] == ch; i++ ) {
                        countDown++;
                    }
                    int countLeft = 0;
                    for( int i = c - 1; i >= 0 && grid[r][i] == ch; i-- ) {
                        countLeft++;
                    }
                    int countRight = 0;
                    for( int i = c + 1; i < grid[0].length && grid[r][i] == ch; i++ ) {
                        countRight++;
                    }
                    if( countUp > 0 && countDown > 0 && countLeft > 0 && countRight > 0
                            && countUp == countDown && countUp == countLeft && countUp == countRight ) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
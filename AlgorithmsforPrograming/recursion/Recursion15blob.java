package AlgorithmsforPrograming.recursion;

public class Recursion15blob {
    private static int N=8;
    private static int[][] grid = {
        {1, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 0, 0},
        {1, 1, 0, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 1, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 0},
        {1, 0, 0, 0, 1, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 1, 1}
    };
    //private static final int BACKGROUND_COLOR = 0;
    private static final int IMAGE_COLOR = 1;
    private static final int ALREADY_CONTED = 2;

    public static int countCells(int x, int y){
        if( x < 0 || y < 0 || x >= N || y >= N)
            return 0;
        else if (grid[x][y] != IMAGE_COLOR)           
            return 0;                     
        else {
            //int count = 0;
            grid[x][y] = ALREADY_CONTED;
            //count++;
            //count += 
            return 1 +countCells(x-1, y)+countCells(x-1, y+1)
                    +countCells(x, y+1)+countCells(x+1, y+1)
                    +countCells(x+1, y)+countCells(x+1, y-1)
                    +countCells(x, y-1)+countCells(x-1, y-1);
            //return count;
        }
    }
    public static void printGrid() {
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printGrid();
        int count = 0;
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                count += countCells(x, y);                
            }
        }
        System.out.println(count);
        printGrid();
    }
}
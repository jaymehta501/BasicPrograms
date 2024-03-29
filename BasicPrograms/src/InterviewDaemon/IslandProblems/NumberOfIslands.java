package InterviewDaemon.IslandProblems;

import java.util.Arrays;

/*Given a 2D matrix map with 0’s and 1’s where 1 is considered as land and 0 considered as water.
Find the total number of islands formed on the map. An island is a land surrounded by water that is
formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

        Input:
        [1, 1, 0, 0, 0]
        [1, 1, 0, 0, 0]
        [0, 0, 1, 0, 0]
        [0, 0, 0, 1, 1]

        Output: 3*/

public class NumberOfIslands {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        System.out.println("Input: " + Arrays.deepToString(matrix));
        int output = numIslands(matrix);
        System.out.println("Output: " + output);
    }

    private static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int totalRows = grid.length;
        int totalCols = grid[0].length;
        // used to calculate total number of islands
        int numOfIslands = 0;
        // iterate over all points of the grid and if is an island watch neighbouring
        for (int startRow = 0; startRow < totalRows; startRow++) {
            for (int startCol = 0; startCol < totalCols; startCol++) {
                if (grid[startRow][startCol] == 1) {
                    numOfIslands++;
                    numIslandsRecursive(grid, startRow, startCol);
                }
            }
        }
        return numOfIslands;
    }

    // Basically using Flood Fill Algorithm
    private static void numIslandsRecursive(int[][] grid,
                                            int currentRow,
                                            int currentCol) {

        if (currentRow < 0 || currentRow >= grid.length
                || currentCol < 0 || currentCol >= grid[0].length
                || grid[currentRow][currentCol] == 0) {
            return;
        }
        // resetting the visited point to 0 so that we do not revisit and re update
        grid[currentRow][currentCol] = 0;
        numIslandsRecursive(grid, currentRow - 1, currentCol);
        numIslandsRecursive(grid, currentRow + 1, currentCol);
        numIslandsRecursive(grid, currentRow, currentCol - 1);
        numIslandsRecursive(grid, currentRow, currentCol + 1);
    }
}

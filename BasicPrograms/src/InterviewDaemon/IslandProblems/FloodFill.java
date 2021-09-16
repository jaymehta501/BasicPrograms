package InterviewDaemon.IslandProblems;

//Given a 2D Matrix, each integer is represented by a pixel value. Given a coordinate (startRow, startCol)
// representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, “flood fill” the image.
//To perform a “flood fill”, consider the starting pixel, plus any pixels connected 4-directionally
// (Left, Right, Top and Bottom) to the starting pixel of the same color as the starting pixel, plus any
// pixels connected 4-directionally to those pixels (also with the same color as the starting pixel),
// and so on. Replace the color of all of the aforementioned pixels with the newColor. Here the first pixel of the image starts with (0, 0)

/*Input:
        [1, 1, 0, 0, 0]
        [1, 1, 0, 0, 0]
        [0, 0, 1, 0, 0]
        [0, 0, 0, 1, 1]

        startRow = 1
        startColumn = 1
        newColor = 2

        Output:
        [1, 1, 0, 0, 0]
        [1, 1, 0, 0, 0]
        [0, 0, 1, 0, 0]
        [0, 0, 0, 1, 1]


        Explanation: From the center of the image (with position (startRow, startCol) = (1, 1)),
        all pixels connected by a path of the same color as the starting pixel are colored with the new color.
        Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.*/


import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 1, 1}
        };
        int startRow = 1;
        int startCol = 1;
        int newColor = 2;
        System.out.println("Input: " + Arrays.deepToString(input));
        System.out.println("Start Row: " + startRow);
        System.out.println("Start Column: " + startCol);
        System.out.println("New Color: " + newColor);
        int[][] output = floodFill(input, startRow, startCol, newColor);
        System.out.println("Output: " + Arrays.deepToString(output));
    }

    private static int[][] floodFill(int[][] grid, int startRow, int startCol, int newColor) {
        // if the grid is null or empty or if the selected pointed is already in newColor
        if (grid == null || grid.length == 0 || grid[startRow][startCol] == newColor) {
            return grid;
        }
        floodFillRecursive(grid, startRow, startCol, grid[startRow][startCol], newColor);
        return grid;
    }

    private static void floodFillRecursive(int[][] grid,
                                           int currentRow,
                                           int currentCol,
                                           int oldColor,
                                           int newColor) {

        if (currentRow < 0 || currentRow >= grid.length
                || currentCol < 0 || currentCol >= grid[0].length
                || grid[currentRow][currentCol] != oldColor) {
            return;
        }

        grid[currentRow][currentCol] = newColor;

        floodFillRecursive(grid, currentRow + 1, currentCol, oldColor, newColor);
        floodFillRecursive(grid, currentRow - 1, currentCol, oldColor, newColor);
        floodFillRecursive(grid, currentRow, currentCol + 1, oldColor, newColor);
        floodFillRecursive(grid, currentRow, currentCol - 1, oldColor, newColor);
    }
}

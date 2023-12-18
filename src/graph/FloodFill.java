package graph;

public class FloodFill { 

    public static void floodFill(int[][] matrix, int startRow, int startCol, int newColor) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int originalColor = matrix[startRow][startCol];

        // Check if the new color is the same as the original color
        if (originalColor == newColor) {
            return; // No need to fill if the colors are the same
        }

        floodFillHelper(matrix, startRow, startCol, originalColor, newColor, rows, cols);
    }

    private static void floodFillHelper(int[][] matrix, int row, int col, int originalColor, int newColor, int rows, int cols) {
        // Check if the current position is within bounds and has the original color
        if (row < 0 || row >= rows || col < 0 || col >= cols || matrix[row][col] != originalColor) {
            return;
        }

        // Fill the current position with the new color
        matrix[row][col] = newColor;

        // Recursively fill the neighboring positions
        floodFillHelper(matrix, row - 1, col, originalColor, newColor, rows, cols); // Up
        floodFillHelper(matrix, row + 1, col, originalColor, newColor, rows, cols); // Down
        floodFillHelper(matrix, row, col - 1, originalColor, newColor, rows, cols); // Left
        floodFillHelper(matrix, row, col + 1, originalColor, newColor, rows, cols); // Right
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 1, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        int startRow = 2;
        int startCol = 2;
        int newColor = 2;

        floodFill(matrix, startRow, startCol, newColor);

        System.out.println("\nMatrix after Flood Fill:");
        printMatrix(matrix);
    }
}


import java.util.Scanner;

/**
 * Created by suraj on 1/27/2017.
 */
//rotating the matrix to the left by 90.
public class MatrixRotation {
    public static void rotateAntiClockWise(int[][] matrix) {
        int rows, cols;
        rows = matrix.length;
        cols = matrix[0].length;
        int[][] newMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                newMatrix[i][j] = matrix[j][cols - i -1];
            }
        }


        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateClockwise(int[][] matrix) {
        int rows, cols;
        rows = matrix.length;
        cols = matrix[0].length;
        int[][] newMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                newMatrix[i][j] = matrix[rows - j - 1][i];
            }
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

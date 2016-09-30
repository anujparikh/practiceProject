package src.com.self.book;

/**
 * Created by anujparikh on 9/30/16.
 */
public class RotateImageAsMatrix {
    public static void rotate(int[][] matrix, int n) {
        int[][] outputMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                outputMatrix[j][(n - 1) - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(outputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12}, {13, 14, 15, 16}};
        rotate(matrix, 4);
    }
}

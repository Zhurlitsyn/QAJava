package lesson4;

public class multiplyMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] finalMatrix = new int[3][3];
        //finalMatrix [0][0] = 0;
        // multiplication
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    finalMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        arrayRandom.print2DArray(finalMatrix);


    }
}

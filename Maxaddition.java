package com.studyopedia;
public class Maxaddition {

    public static void main(String[] args) {
        int[][] matrix1 = {
            {2, 6, 7},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = addMatrices(matrix1, matrix2);

        System.out.println("Result of matrix addition:");
        printMatrix(result);
    }

    public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rows = firstMatrix.length;
        int cols = firstMatrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}


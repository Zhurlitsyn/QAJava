package lesson4;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void fillRandom(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void fillRandom(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    public static void fillRandom(int[][][] arr, int l, int m, int n) {
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    arr[i][j][k] = random.nextInt(100);
                }
            }
        }
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void print2DArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void print2DArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void print3DArray(int[][][] arr, int l, int m, int n) {
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < l; i++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public static void addNumber (int[][][] arr, int l, int m, int n, int num) {
        Random random = new Random();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    arr[i][j][k] += num;
                }
            }
        }
    }

    public static int sumArray2D (int [][] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               sum += array[i][j];
            }
        } return sum;
    }
}



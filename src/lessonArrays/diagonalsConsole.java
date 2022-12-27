package lesson4;

import java.util.Scanner;

public class diagonalsConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of SQUARE array (M x N): ");
        int m = scan.nextInt();
        int[][] arr = new int[m][m];
        arrayRandom.fillRandom(arr);
        arrayRandom.print2DArray(arr);

        System.out.println("Elements of Main diagonal are: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i][i] + " ");

        System.out.println(" \n Elements of Side diagonal are: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i][m - 1 - i] + " ");


    }
}

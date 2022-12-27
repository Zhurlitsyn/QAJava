package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class sort2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array (M x N): ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int [][] arr = new int[m][n];
        arrayRandom.fillRandom(arr);
        System.out.println("Initial Array:");
        arrayRandom.print2DArray(arr);
        for (int i = 0; i < arr.length; i++)
            Arrays.sort(arr[i]);
        System.out.println("Final Array:");
        arrayRandom.print2DArray(arr);


    }
}

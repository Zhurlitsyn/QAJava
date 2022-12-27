package lesson4;

import java.util.Scanner;

public class sum2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array (M x N): ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int [][] arr = new int[m][n];
        arrayRandom.fillRandom(arr);
        arrayRandom.print2DArray(arr);
        System.out.println("Sum of elements of Array is : " + arrayRandom.sumArray2D(arr));

    }
}

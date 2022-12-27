package lesson4;

import java.util.Scanner;

public class array3D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of 3D array:");
        int l = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int [][][] arr3D = new int[l][m][n];
        arrayRandom.fillRandom(arr3D, l, m, n);
        arrayRandom.print3DArray(arr3D, l, m, n);
        System.out.println("Enter adding number: ");
        int num = scan.nextInt();
        arrayRandom.addNumber(arr3D, l, m, n, num);
        arrayRandom.print3DArray(arr3D, l, m, n);
    }
}

package lessonArrays;

import java.util.Scanner;

public class sum2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array (M x N): ");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int [][] arr = new int[m][n];
        ArrayRandom.fillRandom(arr);
        ArrayRandom.print2DArray(arr);
        System.out.println("Sum of elements of Array is : " + ArrayRandom.sumArray2D(arr));

    }
}

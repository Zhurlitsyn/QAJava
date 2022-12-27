package lessonArrays;

import java.util.Arrays;

public class lessonOne {
        public static void main(String[] args) {
            int arr [][] = new int[5][5];
            int [] arrSecond = new int[5];
            ArrayRandom.fillRandom(arr);
            ArrayRandom.print2DArray(arr);

            // sum main & side diagonals
            int sum = 0, sum2 = 0;
            int temp = arr.length;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][temp-1-i];
                sum2 += arr[i][i];

            }
            System.out.println("Sum of main diagonal is: " + sum2);
            System.out.println("Sum of side diagonal is: " + sum);

            for (int i = 0; i < arr.length; i++) {
                Arrays.sort(arr[i]);
                arrSecond[i] = arr[i][4];
            }
            Arrays.sort(arrSecond);

            System.out.println("Maximum - " + arrSecond[4]);
        }
}

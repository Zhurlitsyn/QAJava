/*
Нахождение количества повторных вхождений имен в списке.
Использование Enum, ArrayList collection
 */
package lesson11.names;

import java.util.Scanner;

public class MainNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of Names");
        int amountNames = sc.nextInt();
        Names.countOfNames(amountNames);

    }
}

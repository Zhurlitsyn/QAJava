package lessonObjects.Bankomat;

import java.util.Scanner;

import static lessonObjects.Bankomat.Notes.*;

public class AddMoney {

    public static void addMoney()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter volume 100$ banknotes: ");
        int notes100 = scanner.nextInt();
        System.out.println("Enter volume 50$ banknotes: ");
        int notes50 = scanner.nextInt();
        System.out.println("Enter volume 20$ banknotes: ");
        int notes20 = scanner.nextInt();

        Notes.addNotes (notes100, notes50, notes20);
        int sum = sumNotes();
        System.out.println("The transaction was successfull.");
        Main.menu();
    }
}

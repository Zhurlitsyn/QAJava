package lessonObjects.Bankomat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notes notes = new Notes();
        int sum = Notes.sumNotes();
        menu();


    }

    public static void menuA() {
        System.out.println("Do you want to continue entering the amount?");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. YES | 2. NO");
        switch (scan.nextInt())
        {
            case 1: WithdrawMoney.withdrawMoney();
            case 2: menu();
            default:
                System.out.println("Wrong choice! Try Again.");
        }
    }

    // create a start menu
    public static void menu() {
        System.out.println("------------------ ATM v1.0 ------------");
        System.out.println("1 Add Money | 2 Withdraw money | 3 Sum Money | 4 Exit");
        System.out.print("Make your choice, please:");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                AddMoney.addMoney();
                break;
            case 2:
                WithdrawMoney.withdrawMoney();
                break;
            case 3:
                System.out.println("Total amount is " + Notes.sumNotes());
                menu();
                break;
            case 4:
                System.out.println("Welcome next time!");
                System.exit(0);
            default:
                System.out.println("Wrong number! Try again");
                menu();
                break;
        }

    }
}

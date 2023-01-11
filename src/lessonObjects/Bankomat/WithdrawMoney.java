package lessonObjects.Bankomat;

import java.util.Scanner;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.notes;

public class WithdrawMoney {
    public static void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        int[] notesToClient = new int[]{0, 0, 0};
        int validationTemp = Notes.sumNotes();
        if (validationTemp == 0) {
            System.out.println("There is no Money! Try again later.");
            Main.menu();
        } else {
            System.out.println("Enter the amount to withdraw cash. \nThere are only notes 20 50 and 100");
            System.out.println("Sum should be more than 20 and less than " + Notes.sumNotes());
            int cash = sc.nextInt();
            if (cash % 10 != 0 || cash == 30 || cash < 20 || cash > Notes.sumNotes()) {
                System.out.println("Wrong amount. Try again");
                withdrawMoney();
            } else if (cash == Notes.sumNotes()) {
                notesToClient = new int[]{Notes.getHundred(), Notes.getFifty(), Notes.getTwenty()};
                PrintWithdraw.print(notesToClient);
                System.out.println("The ATM is EMPTY!!");
                Main.menu();
            } else if (cash < 100) {
                //int newCash = cash ;
                //validateSimple(newCash);
                notesToClient = validateSimple(cash);
                Notes.issueNotes(notesToClient[0], notesToClient[1], notesToClient[2]);
                PrintWithdraw.print(notesToClient);
                Main.menu();

            } else {
                int newCash = (cash % 100);
                if (newCash == 10 || newCash == 30) {
                    cash -= 100;
                }
                cash -= newCash;
                notesToClient = validateSimple(newCash); //  по идее тут деньги меньше 100 или 110 или 130
                int[] tempNotes = new int[3];
                tempNotes = validateHundreds(cash);
                for (int i = 0; i < 3; i++) {
                    notesToClient[i] += tempNotes[i];
                }
                Notes.issueNotes(notesToClient[0], notesToClient[1], notesToClient[2]);
                PrintWithdraw.print(notesToClient);
                Main.menu();

            }

        }


    }

    static int[] validateSimple(int cash) {
        int cashSimple = cash / 10;
        int[] arr = new int[]{0, 0, 0};
        switch (cashSimple) {
            case 1 -> arr = validateOne(arr);
            case 3 -> arr = validateThree(arr);
            case 2, 4, 6, 8 -> arr = validateEven(cashSimple, arr);
            case 5 -> arr = validateFive(arr);
            case 7 -> arr = validateSeven(arr);
            case 9 -> arr = validateNine(arr);
        }
        return arr;

    }

    public static int[] validateOne(int[] arr) {
        int n50 = Notes.getFifty();
        int n20 = Notes.getTwenty();
        if ((n50 >= 1) && (n20 >= 3)) {
            //Notes.issueNotes(0, 1, 3);
            arr = new int[]{0, 1, 3};
        } else {
            System.out.println("Transaction rejected. Try again");
            Main.menuA();
        }
        return arr;
    }

    public static int[] validateThree(int[] arr) {
        int n50 = Notes.getFifty();
        int n20 = Notes.getTwenty();
        if ((n50 >= 1) && (n20 >= 4)) {
            //Notes.issueNotes(0, 1, 4);
            arr = new int[]{0, 1, 4};
        } else {
            System.out.println("Transaction rejected. Try again");
            Main.menuA();
        }
        return arr;
    }

    public static int[] validateEven(int cash, int[] arr) {
        int n20 = Notes.getTwenty();

        if (n20 >= cash / 2) {
            //Notes.issueNotes(0, 0, cash);
            arr = new int[]{0, 0, cash / 2};
        } else {
            System.out.println("Transaction rejected. Try again");
            Main.menuA();
        }
        return arr;
    }

    public static int[] validateFive(int[] arr) {
        int n50 = Notes.getFifty();

        if (n50 >= 1) {
            //Notes.issueNotes(0, 1, 0);
            arr = new int[]{0, 1, 0};
        } else {
            System.out.println("Transaction rejected. Try again");
            Main.menuA();
        }
        return arr;
    }

    public static int[] validateSeven(int[] arr) {
        int n20 = Notes.getTwenty();
        int n50 = Notes.getFifty();

        if (n20 >= 1 && n50 >= 1) {
            //Notes.issueNotes(0, 1, 1);
            arr = new int[]{0, 1, 1};
        } else {
            System.out.println("Transaction rejected. Try again");
            Main.menuA();
        }
        return arr;
    }

    public static int[] validateNine(int[] arr) {
        int n20 = Notes.getTwenty();
        int n50 = Notes.getFifty();

        if (n20 >= 2 && n50 >= 1) {
            //Notes.issueNotes(0, 1, 2);
            arr = new int[]{0, 1, 2};
        } else {
            System.out.println("Transaction rejected. Try again");
            Main.menuA();
        }
        return arr;
    }

    public static int[] validateHundreds(int cash) {
        int n100 = Notes.getHundred();
        int n50 = Notes.getFifty();
        int n20 = Notes.getFifty();
        int[] arrHundred = new int[]{0, 0, 0};
        //boolean flag = false;

        do {
            if ((cash / 100) <= n100) {
                arrHundred[0] = cash / 100;
                cash = 0;
            } else {
                cash -= n100 * 100;
                arrHundred[0] = n100;
                if ((cash / 50) <= n50) {
                    arrHundred[1] += cash / 50;
                    cash = 0;
                } else {
                    cash -= (n50 - n50 % 2) * 50;
                    arrHundred[1] = (n50 - n50 % 2);
                    if ((cash / 20) <= n20) {
                        arrHundred[2] = cash / 20;
                        cash = 0;
                    } else {
                        System.out.println("Sorry, it's impossible ");
                        Main.menuA();
                    }
                }
            }
        } while (cash != 0);

        return arrHundred;
    }


}

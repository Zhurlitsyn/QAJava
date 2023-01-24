package lesson11.bankomat_v2;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes {
    private static int hundred;
    private static int fifty;
    private static int twenty;
    //private static int sum;

    public Notes() {
        hundred = 0;
        fifty = 0;
        twenty = 0;
        //sum = 0;
    }

    public static int getHundred() {
        return hundred;
    }

    public static int getFifty() {
        return fifty;
    }

    public static int getTwenty() {
        return twenty;
    }

    static void addNotes(int n100, int n50, int n20) {
        hundred += n100;
        fifty += n50;
        twenty += n20;
    }

    static void issueNotes(int n100, int n50, int n20) {
        hundred -= n100;
        fifty -= n50;
        twenty -= n20;
    }

    static int sumNotes() {
        return hundred * 100 + fifty * 50 + twenty * 20;
    }

    public static void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter volume 100$ banknotes: ");
        int notes100 = scanner.nextInt();
        System.out.println("Enter volume 50$ banknotes: ");
        int notes50 = scanner.nextInt();
        System.out.println("Enter volume 20$ banknotes: ");
        int notes20 = scanner.nextInt();

        addNotes(notes100, notes50, notes20);
        int sum = sumNotes();
        System.out.println("The transaction was successfully.");
        Main.menu();
    }

    public static ArrayList<String> tryNotes(int sum, int minValue, String str, ArrayList<String> pList) {

        if (sum == 0) {
            pList.add(str);
            //System.out.println(str);
            return pList;
        } else if (sum <= 10) return null;
        if (minValue >= 100 && sum >= 100)
            tryNotes(sum - 100, 100, str + " 100", pList);
        if (minValue >= 50 && sum >= 50)
            tryNotes(sum - 50, 50, str + " 50", pList);
        if (minValue >= 20)
            tryNotes(sum - 20, 20, str + " 20", pList);

        return pList;
    }

    public static void wMoney() {
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
                wMoney();
            } else if (cash == Notes.sumNotes()) {
                notesToClient = new int[]{Notes.getHundred(), Notes.getFifty(), Notes.getTwenty()};
                PrintWithdraw.print(notesToClient);
                Notes.issueNotes(Notes.getHundred(), Notes.getFifty(), Notes.getTwenty());
                System.out.println("The ATM is EMPTY!!");
                Main.menu();
            } else {
                String str = " ";
                ArrayList<String> possibleList = new ArrayList<>();
                possibleList = Notes.tryNotes(cash, 100, str, possibleList);
                choiceWithdraw(possibleList);

            }
        }
    }

    public static void choiceWithdraw(ArrayList<String> aList) {
        int[] arr = new int[3];
        String s100 = "100";
        String s50 = "50";
        String s20 = "20";

        for (int i = 0; i < aList.size(); i++) {
            String newStr = aList.get(i);
            if (((newStr + "\0").split(s100).length - 1) > Notes.getHundred() ||
                    ((newStr + "\0").split(s50).length - 1) > Notes.getFifty() ||
                    ((newStr + "\0").split(s20).length - 1) > Notes.getTwenty()) {
                aList.remove(i);
                i--;
            } else {
                System.out.println(aList.indexOf(newStr) + ": " + newStr);
            }
        }
        if (aList.isEmpty()) {
            System.out.println("It impossible to withdraw that amount of Money");
            Main.menuA();
        } else {
            System.out.println("Make a choice of banknotes list: ");
            int chMoneyList = new Scanner(System.in).nextInt();
            String chStr = aList.get(chMoneyList);
            arr[0] = (chStr + "\0").split(s100).length - 1;
            arr[1] = (chStr + "\0").split(s50).length - 1;
            arr[2] = (chStr + "\0").split(s20).length - 1;
            PrintWithdraw.print(arr);
            Notes.issueNotes(arr[0], arr[1], arr[2]);
            Main.menu();
        }
    }

}


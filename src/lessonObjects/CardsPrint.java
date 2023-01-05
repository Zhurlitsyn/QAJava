package lessonObjects;

public class CardsPrint {
    public static void cardsPrint(CreditCard[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n Card " + (i + 1) + " Account Number: " + arr[i].getAccountNumber() + " Account statement: ");
            System.out.printf("%.2f", arr[i].getAccountMoney());
        }
    }

    public static void cardsPrint(CreditCard[] arr, int i) {
        System.out.print("\n Card " + (i + 1) + " Account Number: " + arr[i].getAccountNumber() + " Account statement: ");
        System.out.printf("%.2f", arr[i].getAccountMoney());
    }
}



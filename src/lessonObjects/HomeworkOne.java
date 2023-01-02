package lessonObjects;

import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        CreditCard[] Cards = new CreditCard[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter accounts numbers for card " + (i + 1));
            int tempNum = sc.nextInt();

            System.out.println("Enter sum on card (xxx,xx) for card " + (i + 1));
            double tempMoney = sc.nextDouble();
            Cards[i] = new CreditCard(tempNum, tempMoney);
        }

        System.out.println("Enter amount of deposit for cards 1 and 2 ");
        double refill = sc.nextDouble();

        System.out.println("Enter amount of withdrawal for card 3 ");
        double getMoney = Cards[2].getAccountMoney();
        double withdrawal = ValidateAmount.validateNum(getMoney);
        Cards[2].removalMoney(withdrawal);

        Cards[0].addMoney(refill);
        Cards[1].addMoney(refill);

        CardsPrint.cardsPrint(Cards);




    }
}
